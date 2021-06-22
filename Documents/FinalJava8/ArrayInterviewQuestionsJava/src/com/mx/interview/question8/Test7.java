package com.mx.interview.question8;

import java.util.*;

public class Test7 {

	public static void main(String[] args) {

		List<Integer> px = new ArrayList<Integer>();
		px.add(7);
		px.add(1);
		px.add(2);
		px.add(5);

		maxDifference(px);

	}

	public static int maxDifference(List<Integer> px) {
		// Write your code here
		int max = 0;
		
		// 7,1,2,5

		// 7-0 = 0 not have to compare
		// 1 no have compare
		// 2 2-1 = 1
		// 5 5-1 = 4 -> this is a result
		
		
		
		for (int i = 0; i < px.size(); i++) {
			int t = px.get(i-1);
			System.out.println(t);
		}
		
		
		
		return max;
	}

}
