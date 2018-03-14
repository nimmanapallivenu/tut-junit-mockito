package com.venu.junit;

import com.venu.junit.dao.UserDaoService;
import com.venu.junit.dao.UserDaoServiceImpl;
import com.venu.junit.dto.User;
import com.venu.junit.service.UserService;
import com.venu.junit.service.impl.UserServiceImpl;

/**
 * @author mahesh
 *
 */
public class UserDemo {

	
	public static void main(String[] args) {
		
		UserDaoService userDaoService = new UserDaoServiceImpl();
		UserService userService =new UserServiceImpl(userDaoService);
		
		
		User user = new User(102,"Reddy","Hyd");
		
		System.out.println("Add User");
		userService.createUser(user);
		
		System.out.println("Update User");
		userService.updateUser(user);
		
		System.out.println("Getting Users");
		userService.getUsers();
		
		System.out.println("Delete user");
		userService.removeUser(102);
		
		
	}
}
