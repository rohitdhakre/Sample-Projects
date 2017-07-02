package com.dhakre.rohit.collection.arraylist;

public class StudentComparable implements Comparable<Object> {

	private String name;
	private int age;
	private int rollNum;

	public StudentComparable(String name, int age, int rollNum) {
		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	@Override
	public int compareTo(Object obj) {
		int compare = ((StudentComparable) obj).getAge();
		return this.age - compare;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNum=" + rollNum + "]";
	}

}
