package com.mx.interview.question.two;

public class TestNumbers {

	static long sumOfGroup(int k) {
		long sum = 0;
		long l = (long) k; // casting
		long a = (l * (l - 1)) + 1;// initial element of segment
		long b = ((l + 1) * (l)) + 1;// initial element of next segment
		while (a < b) {
			sum += a;
			a = a + 2;
		}
		return sum;

	}

	public static void main(String[] args) {

		int[] odd = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51,
				53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };

		int sum = 0;
		int g1 = 0;
		int g2 = 0;
		int g3 = 0;
		int g4 = 0;
		int g5 = 0;
		int g6 = 0;
		int k = 4;
		int u = 0;
		int p = 0;

		for (int i = 0; i < odd.length; i++) {

			if (k == 0) {// 0
				sum = 0;
				break;
			}
			if (k == 1) { // 1
				sum = odd[0];
				break;
			}
			if (k == 2) { // 2
				g1 = odd[1];
				g2 = odd[2];
				sum = g1 + g2;
				break;

			}
			if (k == 3) {
				g3 = odd[3];
				g4 = odd[4];
				g5 = odd[5];
				sum = g3 + g4 + g5;
				break;
			}

			if (k == i) {
				int l = k + 2;
				int t = (k * 2) + 1;

				for (int j = l; j <= t; j++) {
					//System.out.println("odd[j]"+ " " +odd[j]);
					sum += odd[j];
				}
			}

		}

		System.out.println("Sum" + " " + sum);

	}
}
