package com.javainuse.dto;

public class TTSPortalClientResponse {

	public TTSPortalClientResponse(String response) {
		super();
		this.response = response;
	}
	
	public TTSPortalClientResponse() {
		super();
	
	}

	private String response;

	@Override
	public String toString() {
		return "TTSPortalClientResponse [response=" + response + "]";
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
}
