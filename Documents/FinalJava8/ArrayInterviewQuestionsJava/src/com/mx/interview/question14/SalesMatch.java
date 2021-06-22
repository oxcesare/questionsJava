package com.mx.interview.question14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SalesMatch {

	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(30);
		ar.add(50);
		ar.add(10);
		ar.add(20);

		int n = 9;
		int pairs = sockMerchant(n, ar);

		System.out.println(pairs);

	}

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here

		int pairs = 0;
		int[] tr = new int[ar.size()];

		for (int i = 0; i < ar.size(); i++) {
			tr[i] = ar.get(i);
		}

		Arrays.sort(tr);

		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < tr.length; i++) {
			set.add(tr[i]);
		}

		int j = 0;
		int p = 0;

		for (Integer element : set) {
			int c = element;
			Integer d = new Integer(c);
			for (int i = 0; i < ar.size(); i++) {

				if (ar.get(i).equals(d)) {
					j++;
				}
			}

			p = j / 2;
			pairs += p;
			p = 0;
			j = 0;

		}

		return pairs;

	}

}
