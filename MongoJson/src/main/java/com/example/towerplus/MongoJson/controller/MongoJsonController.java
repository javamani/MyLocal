package com.example.towerplus.MongoJson.controller;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.towerplus.MongoJson.model.HybridPojoDynamicUser;
import com.example.towerplus.MongoJson.model.Students;
import com.example.towerplus.MongoJson.service.HybridPojoDynamicUserService;
import com.example.towerplus.MongoJson.service.MongoJsonService;
import com.example.towerplus.MongoJson.service.StudentService;

@RestController
@RequestMapping("/mongojson")
public class MongoJsonController {
	
	@Autowired
	private MongoJsonService mongoJsonService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private HybridPojoDynamicUserService hybridService;
	
	@PostMapping("/hybridSave")
	public HybridPojoDynamicUser saveUser(@RequestBody HybridPojoDynamicUser user) {
        return hybridService.saveUser(user);
    }

	@GetMapping("/getAllHybridUsers")
    public List<HybridPojoDynamicUser> getAllUsers() {
        return hybridService.getAllUsers();
	}
	
	@GetMapping("/by-country/{country}")
    public List<HybridPojoDynamicUser> getByCountry(@PathVariable String country) {
        return hybridService.findByCountry(country);
    }

    @GetMapping("/by-theme/{theme}")
    public List<HybridPojoDynamicUser> getByTheme(@PathVariable String theme) {
        return hybridService.findByTheme(theme);
    }
	
	@PostMapping("/saveJson")
	public Document saveJson(@RequestBody String jsonString) {
		Document bsonDocument = Document.parse(jsonString);
		return mongoJsonService.saveJson(bsonDocument);		
	}
	
	@GetMapping("/getAllJson")
	public List<Document> getAllJson() {
		return mongoJsonService.getAllJson();
	}
	
	@PostMapping("/saveStudent")
	public Students saveStudent(@RequestBody Students student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/getAllStudents")
	public List<Students> getAllStudents() {
		return studentService.getAllStudents();
	}

}
