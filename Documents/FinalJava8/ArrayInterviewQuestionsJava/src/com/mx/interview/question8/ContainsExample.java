package com.mx.interview.question8;

import java.util.HashMap;
import java.util.Map;


public class ContainsExample {

	public static void main(String[] args) {
		String f = twoStrings("be", "cat");
		
		System.out.println(f);
		
		
	}

	public static String twoStrings(String s1, String s2) {

		String r = "";

		Map<String, Integer> map1 = new HashMap<String, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			String t = String.valueOf(c);
			map1.put(t, i);
		}

		Map<String, Integer> map2 = new HashMap<String, Integer>();

		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			String t = String.valueOf(c);
			map2.put(t, i);
		}

		 for (Map.Entry<String, Integer> entry : map1.entrySet()) {
		         if(map2.containsKey(entry.getKey())) {
		        	 r ="YES";
		        	 break;
		         }else {
		        	 r ="NO";
		         }
		    }

		return r;

	}

}
