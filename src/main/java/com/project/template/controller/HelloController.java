package com.project.template.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/home")
	public String sayHello() {
		
		return "home";
	}

}
