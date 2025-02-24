package com.example.kafka.kafka_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaMainController {

	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	private static final String TOPIC = "TestTopic";
	
	@GetMapping("publish/{message}")
	public String publishMessage(@PathVariable String message) {		
		kafkaTemplate.send(message,TOPIC);		
		System.out.println("Published successfully no exception received");
		return "Published successfully";		
	}
	
}
