package com.rays.numberseries;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 584;
		int temp = 0;
		int num2 = num;
		int r = 0;
		
		while(num2 != 0) {
			 
			r = num2%10;
			temp = temp*10 + r;
			num2 = num2/10;
		}
		System.out.println(temp);
	}

}
