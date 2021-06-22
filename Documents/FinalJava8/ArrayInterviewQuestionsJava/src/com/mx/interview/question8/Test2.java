package com.mx.interview.question8;

public class Test2 {

	public static void main(String[] args) {
		
	  int r = factorial(5);
	  
	  System.out.println(r);

	}

	public static int factorial(int n) {

		int fact = 0;

		if (n == 0) {
			return 1;
		} else {
			fact = n * (factorial(n - 1));
			return fact;
		}

	}
}
