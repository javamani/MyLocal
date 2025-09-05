package com.example.towerplus.MongoJson.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.towerplus.MongoJson.model.Students;

public interface StudentRepository extends MongoRepository<Students,String> {

}
