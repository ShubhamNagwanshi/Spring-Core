package com.rays.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChildClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PracticeChild.xml");
		
	ParentClass child = 	 (ParentClass) context.getBean("childClass");
	
	System.out.println(child.toString());
	
	}

}
