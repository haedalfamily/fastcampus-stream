package com.fastcampus.functionalprogramming.chapter5.model;

public class Sedan extends Car {
	public Sedan(String name, String brand) {
		super(name, brand);
	}
	
	public void drive() {
		System.out.println("Driving a sedan " + name + " from " +brand);
	}
}
