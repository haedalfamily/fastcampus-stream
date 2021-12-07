package com.fastcampus.functionalprogramming.chapter5.model;

public class User {
	private int id;
	private String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", " + (name != null ? "name=" + name : "") + "]";
	}
}
