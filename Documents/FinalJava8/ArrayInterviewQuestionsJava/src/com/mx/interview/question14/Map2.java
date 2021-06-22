package com.mx.interview.question14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "A");
		map.put("2", "A");
		map.put("3", "A"); //
		map.put("4", "A");

		Set<Map.Entry<String, String>> values = map.entrySet();

		for (Map.Entry<String, String> e : values) {

			System.out.println("key " + " " + e.getKey() + "  " + "Value" + " " + e.getValue());

		}

	}

}
