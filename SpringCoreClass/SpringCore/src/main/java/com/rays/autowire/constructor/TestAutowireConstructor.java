package com.rays.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireConstructor {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-constructor.xml");
		UserService userService = (UserService) context.getBean("userService");

		userService.testAdd();
	}

}
