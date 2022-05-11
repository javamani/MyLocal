package com.javainuse.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.dto.LoginRequest;
import com.javainuse.exception.UserNotFoundException;
import com.javainuser.constants.HRACPUPConstant.PUPQuestionType;

@Controller
public class TestController {

	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
	@PostMapping("/postRequest")
	public ResponseEntity<LoginRequest> postController(@RequestBody LoginRequest loginRequest) {
		
		LoginRequest localLoginRequest = new LoginRequest(loginRequest.getCntryAppxid(),loginRequest.getCustIdentificationNumber(),loginRequest.getUserId());
		localLoginRequest.setHrpuQuestionMap(loginRequest.getHrpuQuestionMap());
		Map<PUPQuestionType,Character> localHRPUMap = null;
		
		if(loginRequest.getCntryAppxid().equalsIgnoreCase("456"))
			throw new UserNotFoundException(loginRequest.getCntryAppxid());
		
		if(loginRequest.getHrpuQuestionMap()!= null && !loginRequest.getHrpuQuestionMap().isEmpty() ) {
			localHRPUMap = loginRequest.getHrpuQuestionMap();
			System.out.println("Map is not empty");
			 for (Map.Entry<PUPQuestionType,Character> entry : localHRPUMap.entrySet())
		            System.out.println("Key = " + entry.getKey() +
		                             ", Value = " + entry.getValue());
		} else {
			System.out.println("Map is empty");
		}
		return new ResponseEntity<LoginRequest>(localLoginRequest,HttpStatus.OK);
	}

}
