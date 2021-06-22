package com.mx.interview.question14;

import java.util.*;

public class BetweenTwoSets {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(4);

		List<Integer> b = new ArrayList<Integer>();
		b.add(16);
		b.add(96);

		int r = BetweenTwoSets.getTotalX(a, b);
		System.out.println(r);

	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		int n = 0;

		Integer max = a.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);

		System.out.println("max" + " " + max);

		int[] arrMax = new int[max + 1];
		int r = 0;
		for (int i = 0; i <= max; i++) {
			r = max * i;
			System.out.println("r" + " " + r);
			arrMax[i] = r;
		}

		int l = b.size(); // size of b
		int d = 0; // cont

		for (int i = 0; i < arrMax.length; i++) {
			int c = arrMax[i];

			if (c > 0) {
				for (int j = 0; j < b.size(); j++) {

					if (b.get(j) % c == 0) {
						d++;
					}
				}

				if (d == l) {
					System.out.println("Numero divisible " + " " + c);
					n++;
				}
				d = 0;
			}

		}

		return n;
	}

}
