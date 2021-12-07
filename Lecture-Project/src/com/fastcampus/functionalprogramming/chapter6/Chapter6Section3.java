package com.fastcampus.functionalprogramming.chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fastcampus.functionalprogramming.chapter6.model.User;
import com.fastcampus.functionalprogramming.chapter6.model.Order.OrderStatus;
import com.fastcampus.functionalprogramming.chapter6.model.Order;

public class Chapter6Section3 {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(3, 6, -4);
		List<Integer> numberListX2 = numberList.stream()
				.map(x -> x * 2)
				.collect(Collectors.toList());
		System.out.println(numberListX2);
		
		Stream<Integer> numberListStream = numberList.stream();
		Stream<String> strStream = numberListStream.map(x -> "Number is " + x);
		List<String> strList = strStream.collect(Collectors.toList());
		System.out.println(strList);
		
		User user1 = new User()
				.setId(101)
				.setName("Alice")
				.setVerified(true)
				.setEmailAddress("alice@fastcampus.co.kr");
		User user2 = new User()
				.setId(102)
				.setName("Bob")
				.setVerified(false)
				.setEmailAddress("bob@fastcampus.co.kr");
		User user3 = new User()
				.setId(103)
				.setName("Charlie")
				.setVerified(true)
				.setEmailAddress("charlie@fastcampus.co.kr");
		List<User> users = Arrays.asList(user1, user2, user3);
		List<String> emailAddresses = users.stream()
				.map(User::getEmailAddress)
				.collect(Collectors.toList());
		System.out.println(emailAddresses);
		
		Order order1 = new Order()
				.setId(1001)
				.setStatus(OrderStatus.CREATED)
				.setCreatedByUserId(101);
		Order order2 = new Order()
				.setId(1002)
				.setStatus(OrderStatus.ERROR)
				.setCreatedByUserId(103);
		Order order3 = new Order()
				.setId(1003)
				.setStatus(OrderStatus.PROCESSED)
				.setCreatedByUserId(102);
		Order order4 = new Order()
				.setId(1004)
				.setStatus(OrderStatus.ERROR)
				.setCreatedByUserId(104);
		Order order5 = new Order()
				.setId(1005)
				.setStatus(OrderStatus.IN_PROGRESS)
				.setCreatedByUserId(101);
		List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
		// TODO: Create list of createdByUserId
		
		
		
	}
}
