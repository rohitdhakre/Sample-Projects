package com.dhakre.rohit.queue;

public class Impl {

	public static void main (String[] args) {
		Queue queue = new Queue();
		queue.push(10);
		queue.pop();
		queue.pop();
		queue.push(20);
		queue.push(30);
		queue.pop();
		queue.pop();
		queue.push(40);
		queue.push(50);
		queue.push(60);
		queue.pop();
		queue.push(70);
		queue.pop();
		queue.push(80);
		queue.pop();
		queue.push(90);
		queue.display();
	}
	
}
