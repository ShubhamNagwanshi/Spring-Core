package com.rays.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByname {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-Name.xml");
		UserService userService = (UserService) context.getBean("userService");
		
		userService.testAdd();
	}

}
