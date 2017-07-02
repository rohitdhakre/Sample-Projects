package com.dhakre.rohit.multithread;

public class ThreadExample implements Runnable {

	int start;
	int end;
	int sum;
	static int arr[];

	static {
		ThreadExample.arr = new int[500];
		for (int i = 1; i <= 500; i++) {
			ThreadExample.arr[i - 1] = i;
		}
	}
	
	public ThreadExample(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		this.sum = 0;
		for (int i = start; i < end; i++) {
			this.sum += ThreadExample.arr[i];
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.sum);
	}
	
	public int getSum() {
		return this.sum;
	}

	public static void main(String[] args) {
		
		ThreadExample te1 = new ThreadExample(0, 100);
		ThreadExample te2 = new ThreadExample(100, 200);
		ThreadExample te3 = new ThreadExample(200, 300);
		ThreadExample te4 = new ThreadExample(300, 400);
		ThreadExample te5 = new ThreadExample(400, 500);
		
		Thread t1 = new Thread(te1, "T1");
		Thread t2 = new Thread(te2, "T2");
		Thread t3 = new Thread(te3, "T3");
		Thread t4 = new Thread(te4, "T4");
		Thread t5 = new Thread(te5, "T5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int sum = te1.getSum() + te2.getSum() + te3.getSum() + te4.getSum() + te5.getSum();
		System.out.println("Showing sum : " + sum);

	}

}
