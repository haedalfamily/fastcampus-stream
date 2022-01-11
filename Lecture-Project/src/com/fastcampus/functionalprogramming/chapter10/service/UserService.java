package com.fastcampus.functionalprogramming.chapter10.service;

import com.fastcampus.functionalprogramming.chapter10.model.User;

public class UserService extends AbstractUserService {

	@Override
	protected boolean validateUser(User user) {
		System.out.println("Validating user " + user.getName());
		return user.getName() != null && user.getEmailAddress().isPresent();
	}

	@Override
	protected void writeToDB(User user) {
		System.out.println("Writing user " + user.getName() + " to DB");
	}
	

}
