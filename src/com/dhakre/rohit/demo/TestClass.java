package com.dhakre.rohit.demo;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner in = new Scanner(System.in);
        int [] arr = new int[in.nextInt()];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int[] seive = new int[max + 1];
        seivePrime(seive);
        findWinner(arr, seive);
        in.close();
    }
    
    public static void seivePrime(int [] seive) {
    	seive[0] = 1;
    	seive[1] = 1;
        int sqrt = (int)Math.sqrt(seive.length);
        for(int i = 2; i <= sqrt; i++) {
            int j = i;
            int k = 2;
            while (j * k < seive.length) {
            	seive[j * k] = 1;
                k++;
            }
        }
        
    }
    
    public static void findWinner(int[] arr, int[] seive) {
        //int sqrt = (int)Math.sqrt(seive.length);
        for(int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            boolean found = false;
            for(int j = 2; j <= sum; j++) {
            //	System.out.println(j + " = " + seive[j]);
            //	System.out.println((sum - j) + " = " + seive[sum - j]);
            	if(seive[j] == 0 && seive[sum - j] == 0) {
                    System.out.println("Deepa");
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.println("Arjit");
            }
        }
    }
    
}
