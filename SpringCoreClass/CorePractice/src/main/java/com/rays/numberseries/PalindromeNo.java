package com.rays.numberseries;

public class PalindromeNo {
	public static void main(String[] args) {
		
		int a = 1551;
		int b = 0;
		int c = 0;
		int d = a;
		
		while(d != 0) {
			b = d%10;
			c = (c * 10) + b;
			d = d/10;
			
		}
		
		if (a == c) {
			System.out.println("this is a Pelindrome Number");
		}else {
			System.out.println("this is not a Palindrome Number");
		}
	}

}
