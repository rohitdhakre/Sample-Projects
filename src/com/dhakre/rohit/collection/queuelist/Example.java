package com.dhakre.rohit.collection.queuelist;

import java.util.PriorityQueue;

public class Example {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Green Apple");
		pq.add("Kashmir Apple");
		pq.add("Custard Apple");
		pq.add("Dragon Fruit");
		pq.add("Ripe Mango");
		pq.add("Jack fruit");
		System.out.println("Original List - " + pq);
		System.out.println("Head - " + pq.peek());
		System.out.println("Remove Element - " + pq.poll());
		System.out.println("Edited List - " + pq);
		System.out.println("Head - " + pq.peek());
		System.out.println("Remove Element - " + pq.poll());
		System.out.println("Edited list - " + pq);

	}

}