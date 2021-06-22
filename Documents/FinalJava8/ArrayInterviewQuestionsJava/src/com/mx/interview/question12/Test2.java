package com.mx.interview.question12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		for (Map.Entry<Integer, String> x : map.entrySet()) {
			System.out.println(x.getKey() + "  " + x.getValue());
		}

		System.out.println("************************");

		Map<Integer, String> map2 = new Hashtable<>();
		map2.put(1, "A");
		map2.put(1,null);
		map2.put(1, "C");

		for (Map.Entry<Integer, String> x : map2.entrySet()) {
			System.out.println(x.getKey() + "  " + x.getValue());
		}

	}

}
