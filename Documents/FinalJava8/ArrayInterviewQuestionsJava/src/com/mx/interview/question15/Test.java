package com.mx.interview.question15;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);

		// 2 9 5 3 3 1 5 3 5

		int l = Test.longestSubarray(ls);

		System.out.println(l);

	}

	public static int longestSubarray(List<Integer> arr) {
		// Write your code here

		List<Integer> aux = new ArrayList<Integer>();

		Set<Integer> set = new TreeSet<>();

		int length = 0;

		for (Integer auxPrimary : arr) {
			set.add(auxPrimary);
		}

		int x = 0;
		for (Integer auxSet : set) {
			int c = auxSet;

			for (int i = 0; i < arr.size(); i++) {

				if (c == arr.get(i)) {
					x++;
				}
			}

			if (x == 2) {
				aux.add(x);
				aux.add(x);
				x = 0;
			}
			if (x == 1) {
				aux.add(x);
				x = 0;
			}

			else {
				x = 0;
			}

		}
		if (set.size() == arr.size()) {
			length = 2;
		} else {
			length = aux.size();
		}

		return length;

	}

}
