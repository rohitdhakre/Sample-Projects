package com.dhakre.rohit.practice.geeksforgeeks;

public class ArmyGame {

	public static void main(String[] args) {
		int n = 1000;
		int m = 1000;
		System.out.println(new ArmyGame().getSupplyDropsCount(n, m));
	}
	
	private int getSupplyDropsCount(int n, int m) {
		int nCount = (n / 2) + (n % 2);
		int mCount = (m / 2) + (m % 2);
		return nCount * mCount;
	}

}
