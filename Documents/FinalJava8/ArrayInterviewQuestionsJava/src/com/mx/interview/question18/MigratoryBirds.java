package com.mx.interview.question18;

import java.util.*;

public class MigratoryBirds {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(5);
		arr.add(4);
		arr.add(4);

		int r = MigratoryBirds.migratoryBirds(arr);

		//System.out.println(r);

	}

	public static int migratoryBirds(List<Integer> arr) {
		// Write your code here

		int r = 0;
		int c =0; //Contador
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 1; i < 6; i++) {
			
			for (int j = 0; j < arr.size(); j++) {
				  
				if(i==arr.get(j)) {
					c++;
				}
			}
			map.put(i, c);
			c=0;
		}

		map.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByValue());
		
		for (Map.Entry<Integer, Integer> map2 : map.entrySet()) {
			System.out.println(map2.getKey()+ " " +  map2.getValue());			
		}
		
		
		return r;

	}

}
