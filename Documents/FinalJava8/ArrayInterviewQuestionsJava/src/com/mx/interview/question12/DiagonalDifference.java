package com.mx.interview.question12;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {

		List<List<Integer>> arr = new ArrayList<>();

		List<Integer> x = new ArrayList<>();
		x.add(11);
		x.add(2);
		x.add(4);

		arr.add(x);

		List<Integer> y = new ArrayList<>();

		y.add(4);
		y.add(5);
		y.add(6);

		arr.add(y);

		List<Integer> z = new ArrayList<>();
		z.add(10);
		z.add(8);
		z.add(-12);

		arr.add(z);

		/*
		 * System.out.println(arr.get(0).get(0)); // 1
		 * System.out.println(arr.get(0).get(4)); // 5
		 * System.out.println(arr.get(0).get(8)); // 9
		 * 
		 * System.out.println(arr.get(0).get(2)); // 3
		 * System.out.println(arr.get(0).get(4)); // 5
		 * System.out.println(arr.get(0).get(6)); // 9
		 * 
		 * 3 x 3 = 9
		 * 
		 * 4 x 4 = 16
		 */

		int dif = DiagonalDifference.diagonalDifference(arr);

		System.out.println(Math.abs(dif));

	}

	public static int diagonalDifference(List<List<Integer>> arr) {

		// Write your code here
		int dif = 0;
		int a = arr.get(0).size() - 1;
		int b = 0;
		int auxSumA = 0;
		int auxSumB = 0;

		for (int i = 0; i < arr.get(0).size(); i++, b++, a--) {

			if (i >= arr.get(i).size()) {
				break;
			}

			for (int j = 0; j < 1; j++) {

				auxSumA += arr.get(i).get(a);

				auxSumB += arr.get(i).get(b);

			}

		}

		dif = auxSumB - auxSumA;

		return dif;

	}

}
