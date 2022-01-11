package com.fastcampus.functionalprogramming.chapter10;

import java.util.Arrays;

import com.fastcampus.functionalprogramming.chapter10.model.User;
import com.fastcampus.functionalprogramming.chapter10.service.InternalUserService;
import com.fastcampus.functionalprogramming.chapter10.service.UserService;
import com.fastcampus.functionalprogramming.chapter10.service.UserServiceInFunctionalWay;

public class Chapter10Section5 {
	public static void main(String[] args) {
		User alice = User.builder(1, "Alice")
				.with(builder -> {
					builder.emailAddress = "alice@fastcampus.co.kr";
					builder.isVerified = false;
					builder.friendUserIds = Arrays.asList(201, 202, 203, 204, 211, 212, 213, 214);
				}).build();
		
		UserService userService = new UserService();
		InternalUserService internalUserService = new InternalUserService();
		
		userService.createUser(alice);
		internalUserService.createUser(alice);
		
		UserServiceInFunctionalWay userServiceInFunctionalWay = new UserServiceInFunctionalWay(
				user -> {
					System.out.println("Validating user " + user.getName());
					return user.getName() != null && user.getEmailAddress().isPresent();
				},
				user -> {
					System.out.println("Writing user " + user.getName() + " to DB");
				});
		userServiceInFunctionalWay.createUser(alice);
	}
}
