package com.towerplus.springrest.example.SpringRestExample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.towerplus.springrest.example.SpringRestExample.dto.LoginRequest;

/**
* authorname Administrator
*/

@RestController
public class LoginController {

	
	@PostMapping("/postRequest")
	public ResponseEntity<LoginRequest> postController(@RequestBody LoginRequest loginRequest) {
		
		LoginRequest localLoginRequest = new LoginRequest(loginRequest.getUserName(),loginRequest.getPassword());
		
		return new ResponseEntity<LoginRequest>(localLoginRequest,HttpStatus.OK);
	}
}
