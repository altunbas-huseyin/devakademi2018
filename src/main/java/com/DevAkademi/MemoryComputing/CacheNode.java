package com.DevAkademi.MemoryComputing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import javax.cache.Cache;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteException;
import org.json.JSONArray;
import org.json.JSONObject;

import com.DevAkademi.UserStatistic.allData.AllData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CacheNode {
	public static String igniteCacheConfFilePath = "/home/mehmetozanguven/eclipse-workspace/UserStatistic/src/main/resources/ignite-configuration.xml";
	public static String jsonFilePath = "/home/mehmetozanguven/Downloads/datas/all_data.json";

	public static void main(String[] args) {
		Ignite ignite = IgniteFactory.createIgniteNodeWithSpecificConfiguration(
                "s", igniteCacheConfFilePath);
		
		 try {
	            final IgniteCache<Long, AllData> igniteCache =
	                    ignite.getOrCreateCache("allDataCache");

	           

	            // load all the datas in the database to the igniteCache
	            igniteCache.loadCache(null);
	            // print the ignite cache
	            printCache(igniteCache);

	        } catch (IgniteException e) {
	            e.printStackTrace();
	        }
	}
	
	
	public static String getJsonFileAsString() {
		String textFormat = ""; 
		try { 
			textFormat = new String(Files.readAllBytes(Paths.get(jsonFilePath))); 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		}
		return textFormat;
	}
	
	 public static void printCache(IgniteCache igniteCache) {
	        Iterator<Cache.Entry<Long, AllData>> cacheIterator = igniteCache.iterator();
	        while (cacheIterator.hasNext()) {
	            System.out.println(cacheIterator.next().getValue());
	        }
	    }
}
