package com.venu.junit.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.venu.junit.dto.User;

public class UserDaoServiceImpl implements UserDaoService {

	static List<User> list = new ArrayList<User>();

	static {
		User user = new User(1, "venu", "chennai");
		User user1 = new User(2, "ram", "chennai");
		list.add(user);
		list.add(user1);

	}

	public User createUser(User user) {
		list.add(user);
		return user;
	}

	public User updateUser(User user) {
		list.add(user);
		return user;
	}

	public List<User> getUsers() {
		return list;
	}

	public void removeUser(int id) {

		Iterator<User> userList = list.iterator();
		boolean found = false;
		while (userList.hasNext()) {
			User user = userList.next();
			if (user.getId() == id) {
				userList.remove();
				found = true;
			}
		}

		if (!found) {
			throw new RuntimeException("User Not Found");
		}

	}

}
