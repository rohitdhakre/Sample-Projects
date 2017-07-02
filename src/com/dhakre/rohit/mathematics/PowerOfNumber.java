package com.dhakre.rohit.mathematics;

public class PowerOfNumber {

	private int number;
	private int power;
	
	public PowerOfNumber() {
		number = 0;
		power = 0;
	}
	
	public PowerOfNumber(int n, int p) {
		number = n;
		power = p;
	}

	public static void main(String[] args) {
		int num = 1;
		PowerOfNumber p = new PowerOfNumber(7, 3);
		System.out.println(p.number != 0 ? p.getNumber(num) : 0);
	}
	
	private int getNumber(int num) {
		if (this.power < 1) {
			return num;
		}
		
		this.power--;
		return getNumber(num * this.number);
	}
	
}