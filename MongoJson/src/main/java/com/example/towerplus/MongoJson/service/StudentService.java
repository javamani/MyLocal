package com.example.towerplus.MongoJson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.towerplus.MongoJson.Repo.StudentRepository;
import com.example.towerplus.MongoJson.model.Students;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Students saveStudent(Students studentDoc) {
		return studentRepository.save(studentDoc);
	}
	
	public List<Students> getAllStudents(){
		return studentRepository.findAll();
	}
}
