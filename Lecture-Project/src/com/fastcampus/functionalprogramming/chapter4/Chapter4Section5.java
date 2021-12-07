package com.fastcampus.functionalprogramming.chapter4;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

import com.fastcampus.functionalprogramming.chapter4.model.User;

public class Chapter4Section5 {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(3, "Alice"));
		users.add(new User(1, "Charlie"));
		users.add(new User(5, "Bob"));
		System.out.println(users);
		
		Comparator<User> idComparator = (u1, u2) -> u1.getId() - u2.getId();
		Collections.sort(users, idComparator);
		System.out.println(users);
		
		Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
		System.out.println(users);
	}

}
