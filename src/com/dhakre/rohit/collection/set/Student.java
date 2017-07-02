package com.dhakre.rohit.collection.set;

public class Student implements Comparable<Student> {

	String name;
	int marks;
	int random;

	public Student() {
	}

	public Student(String name, int marks, int random) {
		this.name = name;
		this.marks = marks;
		this.random = random;
	}

	@Override
	public int compareTo(Student student) {
		int marksComp = student.marks - this.marks;
		if (marksComp == 0) {
			int nameComp = this.name.compareTo(student.name);
			if (nameComp == 0) {
				return this.random - student.random;
			} else {
				return nameComp;
			}
		} else {
			return marksComp;
		}
	}

	@Override
	public String toString() {
		return name + " " + marks;
	}

}
