package com.rays.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNotification {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Notif.xml");
		NotificationService note = (NotificationService) context.getBean("notificationMessage");

		note.sendNotification("Hello Shubham");
	}
}
