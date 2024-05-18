package com.rays.practice;

public class EmailService implements MessageService {

	public void sendMessage(String message) {

		System.out.println("Email message send:"+ message);
	}

}
