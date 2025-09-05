package com.example.towerplus.MongoJson.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JsonModel")
public class JsonModel {

	@Id
	private String id;
	
	private Map<String, Object> dynamicJsonDataMap;
	
	public String getId() {
		return id;
	}

	public Map<String, Object> getDynamicJsonDataMap() {
		return dynamicJsonDataMap;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDynamicJsonDataMap(Map<String, Object> dynamicJsonDataMap) {
		this.dynamicJsonDataMap = dynamicJsonDataMap;
	}

	

}
