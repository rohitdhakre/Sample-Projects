package com.dhakre.rohit.mathematics;

public class NthPrimeNumber {

	public static void main(String[] args) {
        int n = 324;
		int[] arr = new int[10001];
        int count = 0;
        int[] prime = new int[104744];
        for (int i = 2; i < 104744; i++) {
            if (prime[i] == 0) {
                arr[count] = i;
                count++;
                int j = 1;
                int num = i;
                while (num < 104744) {
                    prime[num] = 1;
                    num = j * i;
                    j++;
                }
            }
            if (i % 2 == 1) {
                i++;
            }
        }
        System.out.println(arr[n-1]);
	}

}
