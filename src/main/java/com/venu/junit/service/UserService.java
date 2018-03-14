package com.venu.junit.service;

import java.util.List;

import com.venu.junit.dto.User;

public interface UserService {

	User createUser(User user);

	User updateUser(User user);

	List<User> getUsers();

	void removeUser(int id);

}
