package com.dhakre.rohit.practice.geeksforgeeks;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = {0, 1, 0};
		int size = arr.length;
		MajorityElement m = new MajorityElement();
		m.check(arr, size);
	}
	
	private void check (int arr[], int size) {
	    int count;
	    if(size == 1) {
	    	System.out.println(arr[0]);
	    	return;
	    }
	    for(int i = 0; i <= size/2; i++) {
	        count = 1;
	        for(int j = i + 1; j < size; j++) {
	            if(arr[i] == arr[j]) {
	                count++;
	                if(count > size/2) {
	                    System.out.println(arr[j]);
	                    return;
	                }
	            }
	        }
	    }
	    System.out.println("NO Majority Element");
	}

}
