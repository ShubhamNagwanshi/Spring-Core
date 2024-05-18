package com.rays.autowire.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShubhamAutowire {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("ShubhamByName.xml");
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("shubham-no-type.xml");
		ShubhamService shubh = (ShubhamService) context.getBean("shubhamService");
		
		shubh.testAdd();
	}

}
