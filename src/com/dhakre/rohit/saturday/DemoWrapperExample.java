package com.dhakre.rohit.saturday;

public class DemoWrapperExample {
		
	public static void main(String[] args) {
		Integer a = new Integer(10);
		int b = a.intValue();
		int c = a;
		System.out.println(a + " " + b + " " + c);
		
		int x = 20;
		int y = Integer.valueOf(x);
		int z = x;
		System.out.println(x + " " + y + " " + z);
	}

}
