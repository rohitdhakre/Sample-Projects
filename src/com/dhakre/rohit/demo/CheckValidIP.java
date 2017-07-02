package com.dhakre.rohit.demo;

public class CheckValidIP {

	public static void main(String[] args) {
		String s = "255.232.2a6.211";
		char[] ch = s.toCharArray();
		if (ch[0] == '.' || ch[ch.length - 1] == '.') {
			System.out.println("NO");
			return;
		}
		int count = 0;
		boolean check = false;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '.') {
				if (ch[i + 1] != '.') {
					count++;
				} else {
					System.out.println("NO");
					return;
				}
			}
			if (count == 3) {
				check = true;
			} else {
				check = false;
			}
		}
		if (check) {
			String[] res = s.split("\\.");
			int i = 0;
			while (i < 4) {
				try {
					int ip = Integer.parseInt(res[i]);
					if (!(ip >= 0 && ip <= 255)) {
						System.out.println("NO");
						return;
					}
					i++;
				} catch (Exception e) {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
		} else {
			System.out.println("NO");
			return;
		}
	}
}
