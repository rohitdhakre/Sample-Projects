package com.dhakre.rohit.demo;

public class VariableChecker {

	public static void main(String[] args) {
		int n = 1;
		int count = 0;
        for (int x = 0; x < n; x++) {
        	String s = "foo = 12123;";
            if (s.charAt(s.length() - 1) == ';') {
                String[] result = s.split("\\ ");
                if (result.length == 3 && result[1].equals("=")) {
                    try {
					    result[2] = result[2].substring(0, result[2].length() - 1);
                        Integer.parseInt(result[2]);
                        count++;
                    } catch (Exception e) {
                        
                    }
                }
            }
        }
        System.out.println(count);
	}
}
