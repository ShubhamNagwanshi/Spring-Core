package com.rays.service;

import java.util.List;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

public class UserServiceImpl implements UserServiceInt {

	private UserDAOInt dao = null;

	public void setDao(UserDAOInt dao) {
		this.dao = dao;
	}

	public long add(UserDTO dto) {

		long pk = dao.add(dto);
		return pk;
	}

	public void update(UserDTO dto) {

		dao.update(dto);

	}

	public void delete(long id) {

		dao.delete(id);
	}

	public UserDTO findByPK(long pk) {

		return dao.findByPK(pk);
	}

	public UserDTO findByLogin(String login) {
		return dao.findByLogin(login);
	}

	public List search(UserDTO dto) {
		return dao.search(dto);
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		return dao.search(dto, pageNo, pageSize);
	}

	public UserDTO auth(String login, String password) {
		UserDTO user = dao.auth(login, password);
		return user;
	}

}
