package com.DevAkademi.UserStatistic.allData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
/**
 * Read Json file and map to the AllData class
 * @author mehmetozanguven
 *
 */
@Data
public class ReadJsonFile {
	// path to the all_data.json
	private static final String FILENAME = "/home/mehmetozanguven/Downloads/datas/all_data.json";
	private List<AllData> allDatas;
	
	public ReadJsonFile() {
		allDatas = new ArrayList<>();
	}
	
	public void jsonMapper() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(Feature.ALLOW_COMMENTS, true);
		allDatas = objectMapper.readValue(new File(FILENAME), new TypeReference<List<AllData>>(){});
	}
	
	
}
