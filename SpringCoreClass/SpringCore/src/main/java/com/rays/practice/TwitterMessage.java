package com.rays.practice;

public class TwitterMessage implements MessageService {

	public void sendMessage(String message) {

		System.out.println("Twitter Message send :"+ message);
	}

}
