package com.jenkins.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Controller {
	
	@GetMapping(value="/welcome")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping(value="/hello")
	public String hello() {
		return "Hello1";
	}
}
