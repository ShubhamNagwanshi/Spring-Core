package com.rays.numberseries;

public class AverageTest {
	public static void main(String[] args) {
		int num = 10;
		int count = 0;
		int sum = 0;
		int Avg;
		
		for (int i = 1; i < num; i++) {
			if(i%2==0) {
				sum = sum +i;
				count++;
				
			}
			
		}
		 Avg = sum/count;
		System.out.println(Avg);
	}

}
