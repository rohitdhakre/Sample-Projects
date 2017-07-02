package com.dhakre.rohit.mathematics;

public class ArithmeticProgression {
	
	private int firstNumber;
	private int commonDifference;
	private int numberOfTerms;
	
	public ArithmeticProgression() {
		firstNumber = 0;
		commonDifference = 0;
		numberOfTerms = 0;
	}
	
	public ArithmeticProgression(int a, int d, int n) {
		firstNumber = a;
		commonDifference = d;
		numberOfTerms = n;
	}
	
	public static void main (String[] args) {
		int sum = 0;
		ArithmeticProgression ap = new ArithmeticProgression(12, 5, 10);
		System.out.println("Sum -> " + ap.getSum(sum));
	}
		
	private int getSum(int sum) {
		if (this.numberOfTerms < 1) {
			return sum;
		}
		int num = this.firstNumber;
		this.firstNumber = this.firstNumber + this.commonDifference;
		this.numberOfTerms--;
		System.out.println(num);
		return getSum(sum + num);
	}

}
