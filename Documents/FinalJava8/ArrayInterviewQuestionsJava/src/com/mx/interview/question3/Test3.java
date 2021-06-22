package com.mx.interview.question3;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	
	
	public static void main(String[] args) {
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(2, 2);
		map.put(1, 3);
		
		

		for (Map.Entry<Integer, Integer> map2 : map.entrySet()) {
			System.out.println("Key" + " " + map2.getKey() + " " + "Value" + "  " + map2.getValue());
		}
		
		
	}

}


