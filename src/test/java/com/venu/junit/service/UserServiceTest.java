package com.venu.junit.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.venu.junit.dao.UserDaoService;
import com.venu.junit.dto.User;
import com.venu.junit.service.impl.UserServiceImpl;

public class UserServiceTest {

	private UserDaoService userDaoService;
	
	private UserService userService;
	
	@Before
	public void setup(){
		userDaoService = mock(UserDaoService.class);
		userService = new UserServiceImpl(userDaoService);
	}
	
	@Test
	public void createUser() {
		User user = new User(102,"Reddy","Hyd");
		when(userService.createUser(user)).thenReturn(new User(102,"Reddy","Hyd"));
		
		User user1=userService.createUser(user);
		
		assertEquals("Reddy", user1.getName());
		
		
	}
}
