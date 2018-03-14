package com.venu.junit.service.impl;

import java.util.List;

import com.venu.junit.dao.UserDaoService;
import com.venu.junit.dto.User;
import com.venu.junit.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDaoService userDaoService;

	public UserServiceImpl(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}

	public User createUser(User user) {
		return userDaoService.createUser(user);
	}

	public User updateUser(User user) {

		return userDaoService.updateUser(user);
	}

	public List<User> getUsers() {

		return userDaoService.getUsers();
	}

	public void removeUser(int id) {
		userDaoService.removeUser(id);
	}

}
