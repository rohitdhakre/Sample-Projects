package com.dhakre.rohit.mathematics;

public class GeometricProgression {

	private int firstNumber;
	private int commonRatio;
	private int numberOfTerms;
	
	public GeometricProgression() {
		firstNumber = 0;
		commonRatio = 0;
		numberOfTerms = 0;
	}
	
	public GeometricProgression(int a, int r, int n) {
		firstNumber = a;
		commonRatio = r;
		numberOfTerms = n;
	}

	public static void main(String[] args) {
		int sum = 0;
		GeometricProgression gp = new GeometricProgression(2, 5, 10);
		System.out.println("Sum -> " + gp.getSum(sum));
	}
	
	private int getSum(int sum) {
		if (this.numberOfTerms < 1) {
			return sum;
		}
		int num = this.firstNumber;
		this.firstNumber = this.firstNumber * this.commonRatio;
		numberOfTerms--;
		System.out.println(num);
		return getSum(num + sum);
	}

}