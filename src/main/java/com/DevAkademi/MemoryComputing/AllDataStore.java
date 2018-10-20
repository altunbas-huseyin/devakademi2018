package com.DevAkademi.MemoryComputing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.cache.Cache.Entry;
import javax.cache.integration.CacheLoaderException;
import javax.cache.integration.CacheWriterException;

import org.apache.ignite.cache.store.CacheStoreAdapter;
import org.apache.ignite.lang.IgniteBiInClosure;
import org.json.JSONArray;
import org.json.JSONObject;

import com.DevAkademi.UserStatistic.allData.AllData;
import com.DevAkademi.UserStatistic.user.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AllDataStore extends CacheStoreAdapter<Long, AllData> {
	private String jsonFilePath = "/home/mehmetozanguven/Downloads/datas/all_data.json";

	@Override
	public AllData load(Long key) throws CacheLoaderException {
		return null;
	}

	@Override
	public void write(Entry<? extends Long, ? extends AllData> entry) throws CacheWriterException {
	}

	@Override
	public void delete(Object key) throws CacheWriterException {
	}

	public void loadCache(IgniteBiInClosure<Long, AllData> clo, Object... args) {
		System.out.println("Load all datas to the cache...\n");
		String textFormatOfJson = getJsonFileAsString();
		JSONArray jsonarray = new JSONArray(textFormatOfJson);
		for (int i = 0; i < jsonarray.length(); i++) {
			JSONObject jsonobject = jsonarray.getJSONObject(i);
			AllData alldata = null;
	        ObjectMapper objectMapper = new ObjectMapper();
	        try {
				alldata = objectMapper.readValue(jsonobject.toString(), new TypeReference<AllData>(){});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clo.apply(alldata.getId(), alldata);
		}

	}

	private String getJsonFileAsString() {
		String textFormat = "";
		try {
			textFormat = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return textFormat;
	}

}
