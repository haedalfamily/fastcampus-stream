package com.fastcampus.functionalprogramming.chapter6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.fastcampus.functionalprogramming.chapter6.model.Order;
import com.fastcampus.functionalprogramming.chapter6.model.User;
import com.fastcampus.functionalprogramming.chapter6.model.Order.OrderStatus;

public class Chapter6Section5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, -5, 7, 4);
		List<Integer> sortedNumbers = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		User user1 = new User()
				.setId(101)
				.setName("Paul")
				.setVerified(true)
				.setEmailAddress("alice@fastcampus.co.kr");
		User user2 = new User()
				.setId(102)
				.setName("David")
				.setVerified(false)
				.setEmailAddress("bob@fastcampus.co.kr");
		User user3 = new User()
				.setId(103)
				.setName("John")
				.setVerified(false)
				.setEmailAddress("charlie@fastcampus.co.kr");
		List<User> users = Arrays.asList(user1, user2, user3);
		List<User> sortedUsers = users.stream()
				.sorted((u1, u2) -> u1.getName().compareTo(u2.getName()))
				.collect(Collectors.toList());
		System.out.println(sortedUsers);
		
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
		Order order1 = new Order()
				.setId(1001)
				.setStatus(OrderStatus.CREATED)
				.setCreatedByUserId(101)
				.setCreatedAt(now.minusHours(4));
		Order order2 = new Order()
				.setId(1002)
				.setStatus(OrderStatus.ERROR)
				.setCreatedByUserId(103)
				.setCreatedAt(now.minusHours(1));
		Order order3 = new Order()
				.setId(1003)
				.setStatus(OrderStatus.PROCESSED)
				.setCreatedByUserId(102)
				.setCreatedAt(now.minusHours(36));
		Order order4 = new Order()
				.setId(1004)
				.setStatus(OrderStatus.ERROR)
				.setCreatedByUserId(104)
				.setCreatedAt(now.minusHours(40));
		Order order5 = new Order()
				.setId(1005)
				.setStatus(OrderStatus.IN_PROGRESS)
				.setCreatedByUserId(101)
				.setCreatedAt(now.minusHours(10));
		List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
		
		// TODO: sort the orders based on createdAt

		
		
	}

}
