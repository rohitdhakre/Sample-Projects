package com.dhakre.rohit.list.queue;

class LinkedList {

	Node head;

	void push(int value) {
		Node newNode = new Node(value);
		Node front = head;
		if (head == null) {
			head = newNode;
			System.out.println("Pushed Element - " + value);
			display();
			return;
		}
		while (front.next != null) {
			front = front.next;
		}
		front.next = newNode;
		System.out.println("pushed Element - " + value);
		display();
	}

	void pop() {
		Node rear = head;
		if (head == null) {
			System.out.println("UnderFlow !");
			return;
		}
		System.out.println("Pop Element - " + rear.data);
		head = rear.next;
	}

	void display() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Queue is Empty");
			return;
		}
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}