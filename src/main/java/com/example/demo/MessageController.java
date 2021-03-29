package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message/")
public class MessageController {
	
	@Value("${app.name:Default Welcome to the machine}")
	private String appName;
	
	@GetMapping("/get")
	public MessageResponse getMessage() {
		
		MessageResponse mr = new MessageResponse(1, "Welcome to the machine.");
		
		return mr;
		
	}

}
