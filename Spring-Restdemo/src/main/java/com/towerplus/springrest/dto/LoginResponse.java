package com.towerplus.springrest.dto;
/**
* authorname Administrator
*/

public class LoginResponse {
	
	public String getStatus() {
		return status;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	String status;
	
	int errorCode;
	
	String errorMessage;

}
