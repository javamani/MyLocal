package com.example.towerplus.MongoJson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.towerplus.MongoJson.Repo.HybridPojoDynamicUserRepo;
import com.example.towerplus.MongoJson.model.HybridPojoDynamicUser;

@Service
public class HybridPojoDynamicUserService {
	
	@Autowired
    private HybridPojoDynamicUserRepo repository;

    public HybridPojoDynamicUser saveUser(HybridPojoDynamicUser user) {
        return repository.save(user);
    }

    public List<HybridPojoDynamicUser> getAllUsers() {
        return repository.findAll();
    }
    
    public List<HybridPojoDynamicUser> findByCountry(String country) {
        return repository.findByCountryInMetadata(country);
    }

    public List<HybridPojoDynamicUser> findByTheme(String theme) {
        return repository.findByThemeInPreferences(theme);
    }

}
