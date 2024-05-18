package com.rays.autowire.constructor;

public class UserService {
	private UserDao userDao;

	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	public void testAdd() {
		userDao.add();
	}

}
