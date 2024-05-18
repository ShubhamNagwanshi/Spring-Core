package com.rays.practice;

import com.rays.practice.MessageService;

public class NotificationService {
	private MessageService messageService;


	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	public void sendNotification(String message) {
		messageService.sendMessage(message);
	}

}
