package com.springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.HelloWorld;


//http://localhost:8080/springmvc-0.0.1-SNAPSHOT/helloworld
//HTTP 404 error
	/*
	 * 1: Fixed the SpringMVCDispatcherServlet implmeneted methods.
	 * 2: rearranged webapp folder and helloworld.jsp
	 */
@Controller
public class SpringMVCController {

	@RequestMapping("/helloworld")
    public String handler(Model model) {

        HelloWorld helloWorld = new HelloWorld();
        System.out.println("request received");
        helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
        helloWorld.setDateTime(LocalDateTime.now().toString());
        model.addAttribute("helloWorld", helloWorld);
        System.out.println("response retruned received");
        return "helloworld";
    }
}
