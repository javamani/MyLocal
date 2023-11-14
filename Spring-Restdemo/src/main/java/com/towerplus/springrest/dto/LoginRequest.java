package com.towerplus.springrest.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
* authorname Administrator
*/

@Data
@Getter
@Setter
public class LoginRequest {
	
	String userName;
	
	String passWord;
	
	String message;
	
	 public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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
