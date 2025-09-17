	package com.towerplus.springrest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.towerplus.springrest.dto.LoginRequest;
import com.towerplus.springrest.exception.ResourceNotFoundException;
import com.towerplus.springrest.model.User;

import io.micrometer.core.instrument.MeterRegistry;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("api/HelloSpringBoot")
public class LoginController {

	Logger Log = LoggerFactory.getLogger(LoginController.class);
	

    private final MeterRegistry meterRegistry;
    
    public LoginController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }
    
    @GetMapping("/hello")
    public String hello() {
        // Custom counter metric
        meterRegistry.counter("custom.hello.counter").increment();
        return "Hello, Actuator Metrics!";
    }
	
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
	
	
	@PostMapping(path ="/addUser" , produces = {MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<User> addUser(@RequestBody User user) {		
		Log.debug("addUser request received successfully");
		return new ResponseEntity<User>(user,HttpStatus.OK); 
	}
	
	
	@Operation(
		    summary = "Get customer by  User ID",
		    description = "Returns customer details for the given ID",
		    tags = {"Customer"}
		)
	@GetMapping(path ="/getUser/{userId}" , produces = {MediaType.APPLICATION_JSON_VALUE} )
	public String getUser(@PathVariable int userId) {		
		Log.debug("getUser request received successfully");
		if(userId < 0) {
			throw new ResourceNotFoundException("Resource with id " + userId + "not found ");
		}
		return "User found with Id " + userId;
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
