package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

public class Test {
	
	private UserServiceInt service = null;
	public void setService(UserServiceInt service) {
		this.service = service;
	}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("nikk.xml");
		Test test =  (Test) context.getBean("test");
		
		test.testAdd();
	}
	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("shubham");
		dto.setLastName("nagwanshi");
		dto.setLogin("shubham@gmail.com");
		dto.setPassword("pass1234");
		long pk = service.add(dto);
		System.out.println("Data Inserted... pk = " + pk);
	}
	

}
