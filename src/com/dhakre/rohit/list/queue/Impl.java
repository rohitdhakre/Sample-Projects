package com.dhakre.rohit.list.queue;

public class Impl {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList();
		queue.push(10);
		queue.push(20);
		queue.pop();
		queue.push(30);
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.push(90);
	}

}
