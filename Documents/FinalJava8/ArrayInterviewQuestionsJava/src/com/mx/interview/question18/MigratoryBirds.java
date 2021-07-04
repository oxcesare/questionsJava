package com.mx.interview.question18;

import java.util.*;

public class MigratoryBirds {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		

		int r = MigratoryBirds.migratoryBirds(arr);

		System.out.println(r);

	}

	public static int migratoryBirds(List<Integer> arr) {
		// Write your code here

		HashMap<Integer, Integer> map          = new HashMap<>();
		Map.Entry<Integer, Integer> maxEntry   = null;
		int r 								   = 0;
		int c 								   = 0; // Counter

		
		for (int i = 1; i < 6; i++) {
			
			for (int j = 0; j < arr.size(); j++) {

				if (i == arr.get(j)) {
					c++;
				}
			}
			map.put(i, c);
			c = 0;
		}

		map.entrySet().stream().sorted(Map.Entry.comparingByValue());

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}

		r= maxEntry.getKey();
	
		

		return r;

	}

}
