package com.duzenz.spring.firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	
	@Bean
	public HelloWorldService getMessageService() {
		return new HelloWorldServiceImpl();
	}

	public static void main(final String[] args) {
		final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		final MessageManager manager = context.getBean(MessageManager.class);
		manager.printMessage();
	}
}
