package com.example.towerplus.MongoJson.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.towerplus.MongoJson.model.JsonModel;

public interface MongoJsonRepository extends MongoRepository<JsonModel,String > {
	

}
