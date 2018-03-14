package com.venu.junit.dao;

import java.util.List;

import com.venu.junit.dto.User;

public interface UserDaoService {
	
	User createUser(User user);

	User updateUser(User user);

	List<User> getUsers();

	void removeUser(int id);


}
