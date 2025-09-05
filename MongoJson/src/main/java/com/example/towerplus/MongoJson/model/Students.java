package com.example.towerplus.MongoJson.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "STUDENT")
public class Students {
	
	@Id
	private String studentId;

	private String studentName;
	
	private String StudentMajor;

	public String getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentMajor() {
		return StudentMajor;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentMajor(String studentMajor) {
		StudentMajor = studentMajor;
	}
	
	
}
