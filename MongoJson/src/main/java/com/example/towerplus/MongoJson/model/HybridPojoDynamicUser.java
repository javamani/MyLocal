package com.example.towerplus.MongoJson.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HybridUsers")
public class HybridPojoDynamicUser {
	
	@Id
    private String id;

    // Strongly typed fields
    private String name;
    private String project;
    private List<String> skills;
    

    // Flexible JSON (key-value pairs, stored as JSON in MongoDB)
    private Map<String, Object> metadata;


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getProject() {
		return project;
	}


	public List<String> getSkills() {
		return skills;
	}


	public Map<String, Object> getMetadata() {
		return metadata;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setProject(String project) {
		this.project = project;
	}


	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

}
