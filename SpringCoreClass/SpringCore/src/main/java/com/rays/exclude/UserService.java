package com.rays.exclude;

public class UserService {

	private String name;

	public UserService(String name) {
		super();
		this.name = name;
	}
	public void greet() {
		System.out.println("Hello, " + name + "!");
	}
}
