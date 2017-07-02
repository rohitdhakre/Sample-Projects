package com.dhakre.rohit.multithread;

public class Impl1 {	
	public static void main(String[] args) {
		ExtendThreadClass t = new ExtendThreadClass();
		ExtendThreadClass t1 = new ExtendThreadClass();		
//		ImplementRunnableInterface r = new ImplementRunnableInterface();
//		TestSleepMethod s = new TestSleepMethod();
//		TestSleepMethod s1 = new TestSleepMethod();
//		TestJoinMethod j = new TestJoinMethod();
//		TestJoinMethod j1 = new TestJoinMethod();
//		TestJoinMethod j2 = new TestJoinMethod();
//		TestJoinMethod j3 = new TestJoinMethod();
		
/* 		t.start();										// Invoke Run method of ExtendThreadClass
		Thread t1 = new Thread(r);						// For Runnable interface this step is used	
		t1.start();										// Invoke Run method of ImplementRunnableInterface
		s.start();
		s1.start();
		j.start();
		try {
			j.join(1500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		j1.start();
		try {
			j1.join(1500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		j2.start();
		j3.start();*/
		
		System.out.println("Name of t: " + t.getName());
		System.out.println("Name of t1: " + t1.getName());
		System.out.println("Id of t: " + t.getId());
		System.out.println("Id of t1: " + t1.getId());
		t.start();
		t1.start();
		t.setName("Vibhuti Narayan Mishra");
		t1.setName("Prem Choudhary");
		System.out.println("Changed Name of t: " + t.getName());
		System.out.println("Changed Name of t1: " + t1.getName());
	}

}
