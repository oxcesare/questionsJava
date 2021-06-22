package com.mx.interview.question11;

public class LibraryFine {

	public static void main(String[] args) {

		int d1 = 5;
		int m1 = 8;
		int y1 = 2004;
		int d2 = 20;
		int m2 = 1;
		int y2 = 2004;

		/*
		 * int d1 = 5; int m1 = 5; int y1 = 2014; int d2 = 23; int m2 = 2; int y2 =
		 * 2014;
		 */

		int result = LibraryFine.libraryFine(d1, m1, y1, d2, m2, y2);

		System.out.println(result);

	}

	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		// Write your code here

		int result = 0;

		if (d1 < d2 && m1 < m2 && y1 < y2) {
			result = 0;
		} else if (d1 > d2 && m1 == m2 && y1 == y2) {
			result = (d1 - d2) * 15;

		} else if (d1 > d2 && m1 > m2 && y1 == y2) {
			result = (m1 - m2) * 500;

		} else if (d1 < d2 && m1 > m2 && y1 == y2) {
			result = (m1 - m2) * 500;

		} else if (y1 > y2) {
			result = 10000;
		}

		return result;

	}

}
