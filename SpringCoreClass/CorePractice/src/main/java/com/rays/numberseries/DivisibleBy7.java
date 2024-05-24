package com.rays.numberseries;

public class DivisibleBy7 {
public static void main(String[] args) {
	int a = 7;
	int count = 0;
	int sum = 0;
	
	for (int i = 100; i < 200; i++) {
		if(i%7 == 0) {
			System.out.println(i);
			
			sum = sum + i;
		}
	}
	
	System.out.println("Sum =" + sum);
}
}
