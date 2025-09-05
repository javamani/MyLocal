package com.example.towerplus.MongoJson.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.towerplus.MongoJson.model.HybridPojoDynamicUser;

public interface HybridPojoDynamicUserRepo  extends MongoRepository<HybridPojoDynamicUser, String> {

	  @Query("{ 'metadata.country': ?0 }")
	    List<HybridPojoDynamicUser> findByCountryInMetadata(String country);
	  
	  @Query("{ 'metadata.preferences.theme': ?0 }")
	    List<HybridPojoDynamicUser> findByThemeInPreferences(String theme);
	
}
