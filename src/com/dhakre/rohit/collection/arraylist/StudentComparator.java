package com.dhakre.rohit.collection.arraylist;

import java.util.Comparator;

public class StudentComparator {

	private String name;
	private int age;
	private int rollNum;

	public StudentComparator(String name, int age, int rollNum) {
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

	public static Comparator<StudentComparator> compareName = new Comparator<StudentComparator>() {

		public int compare(StudentComparator s1, StudentComparator s2) {
			String studentName1 = s1.getName().toUpperCase();
			String studentName2 = s2.getName().toUpperCase();
			return studentName1.compareTo(studentName2);
		}
	};

	public static Comparator<StudentComparator> compareRollNum = new Comparator<StudentComparator>() {

		public int compare(StudentComparator s1, StudentComparator s2) {
			int studentRollNum1 = s1.getRollNum();
			int studentRollNum2 = s2.getRollNum();
			return studentRollNum1 - studentRollNum2;
		}

	};

	@Override
	public String toString() {
		return "StudentComparator [name=" + name + ", age=" + age + ", rollNum=" + rollNum + "]";
	}
}
