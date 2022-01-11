package com.fastcampus.functionalprogramming.chapter10.service;

import java.util.function.Consumer;
import java.util.function.Predicate;

import com.fastcampus.functionalprogramming.chapter10.model.User;

public class UserServiceInFunctionalWay {
	private final Predicate<User> validateUser;
	private final Consumer<User> writeToDB;
	
	public UserServiceInFunctionalWay(Predicate<User> validateUser, Consumer<User> writeToDB) {
		this.validateUser = validateUser;
		this.writeToDB = writeToDB;
	}
	
	public void createUser(User user) {
		if (validateUser.test(user)) {
			writeToDB.accept(user);
		} else {
			System.out.println("Cannot create user");
		}
	}
}
