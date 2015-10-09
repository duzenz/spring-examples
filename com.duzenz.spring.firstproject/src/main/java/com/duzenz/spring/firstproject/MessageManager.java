package com.duzenz.spring.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManager {
	@Autowired
	HelloWorldService service;

	public void printMessage() {
		System.out.println(this.service.getMessage());
	}
}