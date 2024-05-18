package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.dao.UserDaoInt;
import com.rays.dto.UserDTO;

@Service
public class UserServiceImp implements UserServiceInt {
	@Autowired
	private UserDaoInt dao = null;

//	@Transactional(propagation = Propagation.REQUIRED)
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

	public UserDTO findByLogin(String login) {

		return dao.findByLogin(login);
	}

	public UserDTO findByPK(long pk) {
		// TODO Auto-generated method stub
		return dao.findByPK(pk);
	}

	public UserDTO authenticate(String login, String password) {
		UserDTO user = dao.authenticate(login, password);
		return user;
	}

	public List search(UserDTO dto) {

		return dao.search(dto);
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return dao.search(dto, pageNo, pageSize);
	}

}