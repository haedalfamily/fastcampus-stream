package com.fastcampus.functionalprogramming.chapter10;

import com.fastcampus.functionalprogramming.chapter10.model.User;

public class Chapter10Section2 {

	public static void main(String[] args) {
		User user = User.builder(1, "Alice")
				.with(builder -> {
					builder.emailAddress = "alice@fastcampus.co.kr";
					builder.isVerified = true;
				}).build();
		System.out.println(user);
	}

}
