package com.rays.numberseries;

public class RandomNumber {
	public static void main(String[] args) {
		
		int max = 100;
		int min = 1;
		
		int range = max-min;
		for (int i = 1; i <= 6; i++) {
			
			int rd = (int) (Math.random()*range);
			
			System.out.println(rd);
			
		}
	}

}
