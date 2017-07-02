package com.dhakre.rohit.stack;

public class Stack {

	private int top = -1;
	private int size;
	private int[] arr;

	public Stack() {
	}

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
	}

	public void push(int num) {
		if (top == size - 1) {
			System.out.println("Overflow");
		} else {
			top++;
			arr[top] = num;
			System.out.println("Pushed element - " + num);
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("UnderFlow");
		} else {
			int num = arr[top];
			top--;
			System.out.println("Popped element - " + num);
		}
	}

	public void display() {
		System.out.println();
		System.out.print("Stack contains - ");
		if (top == -1) {
			System.out.print("No Elements");
		}
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

}
