package com.dhakre.rohit.stack;

public class Impl {

	public static void main(String[] args) {

		Stack s = new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.display();
	}

}
