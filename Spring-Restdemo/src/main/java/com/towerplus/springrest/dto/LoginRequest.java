package com.towerplus.springrest.dto;
/**
* authorname Administrator
*/

public class LoginRequest {
	
	String userName;
	
	String passWord;
	
	 public LoginRequest() {}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String password) {
		this.passWord = password;
	}
	
	public LoginRequest(String userName, String password) {
		this.userName = userName;
		this.passWord = password;
		
	}

}
