package com.mx.interview.question7;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {

		int[] x = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		Arrays.sort(x);

		int[] y = new int[x.length];

		int d = 0;

		// first order the array
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				y[d] = x[i];
				d++;
			}
		}

		for (int i = 0; i < y.length; i++) {
			System.out.println("array - y " + " " + y[i]);
		}

	}

}
