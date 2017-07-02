package com.dhakre.rohit.practice.geeksforgeeks;

public class BalancedParenthesis {

	int top = -1;
	char[] c;

	public BalancedParenthesis() {
	}

	public BalancedParenthesis(int length) {
		c = new char[length];
	}

	public static void main(String[] args) {
		String s = "(){}[{()(){}}]";
		new BalancedParenthesis(s.length()).stack(s);
	}

	public void stack(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				push(s.charAt(i));
			} else {
				boolean isBalanced = pop(s.charAt(i));
				if (!isBalanced) {
					System.out.println("Unbalanced");
					return;
				}
			}
		}
		System.out.println(top == -1 ? "Balanced" : "Unbalanced");
	}

	public void push(char x) {
		top++;
		c[top] = x;
	}

	public boolean pop(char x) {
		if (top == -1) {
			return false;
		}
		if (x == ')') {
			if (c[top] == '(') {
				top--;
				return true;
			} else {
				return false;
			}
		} else if (x == '}') {
			if (c[top] == '{') {
				top--;
				return true;
			} else {
				return false;
			}
		} else {
			if (c[top] == '[') {
				top--;
				return true;
			} else {
				return false;
			}
		}
	}

}