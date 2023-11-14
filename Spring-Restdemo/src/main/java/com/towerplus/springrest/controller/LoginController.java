	package com.towerplus.springrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.towerplus.springrest.dto.LoginRequest;

/**
* authorname Administrator
*/
/*
 * {
    "userName": "Mani",
    "passWord": "ManiPassword",
    "message": "Request Param Initialized Successfully"
}

<userName>Mani</userName>
<password>ManiPassword</password>
<message>Request Param Initialized Successfully</message>
 * 
 * 
 */
@RestController
public class LoginController {

	@PostMapping(path ="/LoginRequestJSON" , produces = {MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<LoginRequest> getLoginRequest(@RequestBody LoginRequest loginRequest) {
		System.out.println("loginRequest in JSON is  " + loginRequest.toString());
		System.out.println("LoginRequest userName is " + loginRequest.getUserName());
		System.out.println("LoginRequest passWord is " + loginRequest.getPassWord());
		
		
		LoginRequest localLoginRequest = new LoginRequest(loginRequest.getUserName(),loginRequest.getPassWord());
		if(loginRequest != null) {
			System.out.println("Login Request is not empty:");
			loginRequest.setMessage("Request Param Initialized Successfully");
		}
		System.out.println("local Request in JSON :" + localLoginRequest.getUserName());
		
		return new ResponseEntity<LoginRequest>(loginRequest,HttpStatus.OK);
	}
	
	@PostMapping(path ="/LoginRequestXML" , produces = {MediaType.APPLICATION_XML_VALUE} ,
	consumes = {MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<LoginRequest> getLoginRequestXML(@RequestBody LoginRequest loginRequest) {
		System.out.println("loginRequest in XML is  " + loginRequest.toString());
		System.out.println("LoginRequest userName is " + loginRequest.getUserName());
		System.out.println("LoginRequest passWord is " + loginRequest.getPassWord());
		
		
		LoginRequest localLoginRequest = new LoginRequest(loginRequest.getUserName(),loginRequest.getPassWord());
		if(loginRequest != null) {
			System.out.println("Login Request is not empty:");
			loginRequest.setMessage("Request Param Initialized Successfully");
		}
		System.out.println("local Request in XML :" + localLoginRequest.getUserName());
		
		return new ResponseEntity<LoginRequest>(loginRequest,HttpStatus.OK);
	}
}
