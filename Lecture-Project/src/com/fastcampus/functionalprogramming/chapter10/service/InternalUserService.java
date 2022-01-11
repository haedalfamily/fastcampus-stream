package com.fastcampus.functionalprogramming.chapter10.service;

import com.fastcampus.functionalprogramming.chapter10.model.User;

public class InternalUserService extends AbstractUserService {
	@Override
	protected boolean validateUser(User user) {
		System.out.println("validating internal user " + user.getName());
		return true;
	}

	@Override
	protected void writeToDB(User user) {
		System.out.println("Writing user " + user.getName() + " to internal DB");
	}
}
