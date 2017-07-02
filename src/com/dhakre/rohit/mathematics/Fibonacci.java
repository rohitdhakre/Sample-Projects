package com.dhakre.rohit.mathematics;

public class Fibonacci {
	
	private int firstNum;
	private int secondNum;
	private int numberOfTerms;
	public Fibonacci() {
		firstNum = 0;
		secondNum = 1;
		numberOfTerms = 10;
	}
	
	public Fibonacci(int f, int s, int n) {
		firstNum = f;
		secondNum = s;
		numberOfTerms = n;
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.getSeries();
	}
	
	private void getSeries() {
		if (this.numberOfTerms < 1) {
			return;
		}
		System.out.println(this.firstNum);
		int num = this.firstNum;
		this.firstNum = this.secondNum;
		this.secondNum = num + this.firstNum;
		this.numberOfTerms--;
		getSeries();
	}

}
