package com.practice.genericUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

import com.mysql.cj.xdevapi.JsonParser;

public class JsonFileUtility {
 
	
	public String readDataFromJson(String key) throws Exception {
		FileReader jsonfile = new FileReader("./commondata.json");
		
		JSONParser jsonObj = new JSONParser();
		Object jsonData = jsonObj.parse(jsonfile);
		
		HashMap map = (HashMap)jsonData;
		String value = map.get(key).toString();
		
		return value;
	}
}
