package com.dhakre.rohit.producer_consumer;

public class Queue {

	Node head;
	int size;
	int count;

	public Queue(int size) {
		this.size = size;
		this.count = 0;
	}

	public Integer push(int data) {
		if (head == null) {
			Node newNode = new Node(data);
			head = newNode;
			count++;
			return data;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		if (count >= size) {
			System.out.println("Overflow");
			return null;
		}
		count++;
		Node newNode = new Node(data);
		temp.next = newNode;
		return data;
	}

	public Integer pop() {
		if (head == null) {
			System.out.println("Underflow");
			return null;
		}
		count--;
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp.data;
	}

	public int getSize() {
		return count;
	}

}