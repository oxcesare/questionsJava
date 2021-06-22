package com.mx.interview.question10;

import java.util.*;

public class CircularArray {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		int k = 2;
		int n = 3;
		
		List<Integer> queries  = new ArrayList<Integer>();
		queries.add(1);
		queries.add(0);
		
		
		List<Integer> result = circularArrayRotation(a, k, queries);
		
	    for (Integer integer : result) {
	    	System.out.println(integer);
			
		}
	}

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
	
		
		/**
		 *  [1,2,3] -> [3,2,1] - > [2,3,1]
		 * 
		 * 
		 */
		
		List<Integer> result  = new ArrayList<Integer>();
		
		//k = numbers of rotations
		for (int i = 0; i < k; i++) {
			//get the las element
			 int d = a.get(a.size()-1);
			 int t = a.get(0);			 
			 a.remove(a.size()-1);
			 a.add(0, d);			 
		}
		
		for (int i = 0; i < queries.size(); i++) {
			 result.add(a.get(queries.get(i)));
		}
		
		return result;
		
		

	}

}
