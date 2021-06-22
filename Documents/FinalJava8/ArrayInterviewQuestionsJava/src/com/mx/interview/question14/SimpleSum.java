package com.mx.interview.question14;

import java.util.ArrayList;
import java.util.List;

public class SimpleSum {

	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(10);
		ar.add(11);

		int sum = SimpleSum.simpleArraySum(ar);

		System.out.println(sum);

	}

	public static int simpleArraySum(List<Integer> ar) {
		// Write your code here

		int sum = 0;

		for (Integer integer : ar) {

			sum += integer;
		}

		return sum;

	}

}
