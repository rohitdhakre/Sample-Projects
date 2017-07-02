package com.dhakre.rohit.queue;

public class Queue {
	
	int size = 5;
	int front = -1;
	int rear = -1;
	int arr[] = new int[size];

	void push(int a) {
		if(front < size - 1) {
			if(front < rear && front != -1) {
				front++;
				if(front == rear) {
					System.out.println("Overflow");
				}
				else {
					arr[front] = a;
					System.out.println("Pushed Element - " + a);
				}
			}
			else {
				front++;
				arr[front] = a;
				System.out.println("Pushed Element - " + a);
			}
		}
		else {
			if(rear > 0) {
				front = 0;
				arr[front] = a;
				System.out.println("Pushed Element - " + a);
			}
			else {
				System.out.println("Overflow");
			}
		}
		if(rear == -1) {
			rear++;
		}
		display();
	}

	void pop() {
		if(front == -1 && rear == -1) {
			System.out.println("Underflow");
		}
		else {
			if(front == rear) {
				System.out.println("Popped Element - " + arr[rear]);
				front = -1;
				rear = -1;
			}
			else {
				if(rear < size - 1) {
					System.out.println("Popped Element - " + arr[rear]);
					rear++;
				}
				else {
					System.out.println("Popped Element - " + arr[rear]);
					rear = 0;
				}
			}
		}
		display();
	}

	void display() {
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty");
		}
		else {
			if(front >= rear) {
				for(int i = rear; i <= front; i++) {
					System.out.println(arr[i]);
				}
			}
			else {
				for(int j = rear; j <= size - 1; j++) {
					System.out.println(arr[j]);
				}
				for(int k = 0; k <= front; k++) {
					System.out.println(arr[k]);
				}
			}
		}
		System.out.println();
	}
}