package com.rays.autowire.byName;

public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void testAdd() {
		userDao.add();
	}

}
