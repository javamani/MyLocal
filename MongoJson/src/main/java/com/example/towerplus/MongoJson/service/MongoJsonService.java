package com.example.towerplus.MongoJson.service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongoJsonService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	 public Document saveJson(Document document) {
		 return mongoTemplate.save(document,"JsonModel");
	 }
	 
	 public List<Document> getAllJson(){
		 return mongoTemplate.findAll(Document.class,"JsonModel");
	 }
	
	

}
