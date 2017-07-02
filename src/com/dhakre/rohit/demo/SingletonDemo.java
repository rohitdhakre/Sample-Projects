package com.dhakre.rohit.demo;

public class SingletonDemo {

	private static SingletonDemo obj = new SingletonDemo();

	private SingletonDemo() {
	}

	public static SingletonDemo getInstance() {
		return obj;
	}

	public int add(int a, int b) {
		return a + b;
	}

}