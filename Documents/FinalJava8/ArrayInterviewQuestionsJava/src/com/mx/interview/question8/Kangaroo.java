package com.mx.interview.question8;

public class Kangaroo {

	public static void main(String[] args) {

		int x1 = 2081;
		int v1 = 8403;
		int x2 = 9107;
		int v2 = 8400;
		
		//1113 612  1331 610
		//2081 8403 9107 8400

		
		String y = kangaroo(x1, v1, x2, v2);
		System.out.println(y);

	}

	public static String kangaroo(int x1, int v1, int x2, int v2) {

		String y = "";

		for (int i = x1, j = x2; j < 10000; i += v1, j += v2) {

			System.out.println("i"+" "+i);
			System.out.println("j"+" "+j);
			
			
			if (i == j) {				
				y = "YES";				
			} else {
				y = "NO";				
			}
		}

		return y;

	}

}
