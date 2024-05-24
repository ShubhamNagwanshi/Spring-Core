package com.rays.numberseries;

public class RightAngleTriangle {
//	public static void main(String[] args) {
////		for (int i = 0; i < 5; i++) {
////			for (int j = 0; j < i; j++) {
////				System.out.print("* ");
////
////			}
////			System.out.println();
////
////		}
////	}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//
//			System.out.println();
//		}
//	}
	public static void main(String []args) {
		
		for(int a=0;a<=5;a++) 
		{
			for (int b=0;b<=a;b++) 
			{
				System.out.print("*");
				
			}
			System.out.println ();
		}
		

		for(int a=1;a<=5;a++) {
			
		for (int b=5;b>=a;b--) {
				
			System.out.print(b);
			}
			System.out.println();
		}
		
		
		
		}
}
