package com.dhakre.rohit.demo;

public class Demo3 {

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		System.out.println(d.sum(555583247));
	}
	
	public int sum(int n) {
        if (n / 10 == 0) {
            return n;
        }
        int res = (n%10) + sum(n/10);
        if (res / 10 == 0) {
            return res;
        } else {
            return sum(res);
        }
    }
}
