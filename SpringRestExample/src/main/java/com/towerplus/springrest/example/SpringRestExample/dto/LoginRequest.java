package com.towerplus.springrest.example.SpringRestExample.dto;
/**
* authorname Administrator
*/

public class LoginRequest {
	
String userName;
	
	String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public LoginRequest(String userName, String password) {
		this.userName = userName;
		this.password = password;
		
	}

}
