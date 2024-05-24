package com.rays.numberseries;

public class FabanacciSeries {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		System.out.println(x + "\n" + y);

		for (int i = 0; i < 10; i++) {
			int z = x + y;

			x = y;
			y = z;

			System.out.println(z);
		}
	}

}
