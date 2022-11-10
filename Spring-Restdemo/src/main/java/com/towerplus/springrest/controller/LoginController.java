	package com.towerplus.springrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.towerplus.springrest.dto.LoginRequest;

/**
* authorname Administrator
*/

@RestController
public class LoginController {
	
	@RequestMapping(value = "/postRequest",consumes = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.POST)
	public ResponseEntity<LoginRequest> postController(@RequestBody LoginRequest loginRequest) {
		System.out.println("loginRequest is " + loginRequest.toString());
		System.out.println("LoginRequest userName is " + loginRequest.getUserName());
		System.out.println("LoginRequest passWord is " + loginRequest.getPassword());
		
		LoginRequest localLoginRequest = new LoginRequest(loginRequest.getUserName(),loginRequest.getPassword());
		System.out.println("local Request :" + localLoginRequest.getUserName());
		
		return new ResponseEntity<LoginRequest>(loginRequest,HttpStatus.OK);
	}
}
