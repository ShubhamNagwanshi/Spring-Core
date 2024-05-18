package com.rays.practice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBottle {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bottle.xml");
		Factory factory = (Factory) context.getBean("factory");
		
		factory.testAdd();
	}

}
