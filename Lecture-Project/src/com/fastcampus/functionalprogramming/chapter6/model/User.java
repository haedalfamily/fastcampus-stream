package com.fastcampus.functionalprogramming.chapter6.model;

import java.util.List;

public class User {
	private int id;
	private String name;
	private String emailAddress;
	private boolean isVerified;
	private List<Integer> friendUserIds;
	
	public int getId() {
		return id;
	}
	
	public User setId(int id) {
		this.id = id;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public User setName(String name) {
		this.name = name;
		return this;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public User setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}
	
	public boolean isVerified() {
		return isVerified;
	}
	
	public User setVerified(boolean isVerified) {
		this.isVerified = isVerified;
		return this;
	}
	
	public List<Integer> getFriendUserIds() {
		return friendUserIds;
	}
	
	public User setFriendUserIds(List<Integer> friendUserIds) {
		this.friendUserIds = friendUserIds;
		return this;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (emailAddress != null ? "emailAddress=" + emailAddress + ", " : "") + "isVerified=" + isVerified
				+ ", " + (friendUserIds != null ? "friendUserIds=" + friendUserIds : "") + "]";
	}
}
