package com.mx.interview.question3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author cesaralducinruiz
 * 
 *         Formas de iterar un Map
 *
 */
public class IterarMap {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<String, Integer>(); // No Ordenado
		map1.put("1", 4);
		map1.put("2", 7);
		map1.put("3", 1);
		map1.put("4", 3);

		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}

		System.out.println("***************************************************");

		Map<String, Integer> map2 = new TreeMap<>(Comparator.reverseOrder()); // Ordenado
		map2.put("2", 4);
		map2.put("4", 7);
		map2.put("1", 1);
		map2.put("3", 3);

		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		
		
		System.out.println("***************************************************+");
		
		/**
		 * Es un tipo de estructura es ordenada
		 */
		TreeMap<Integer, String> map3= new TreeMap<>();
		map3.put(3, "val");
		map3.put(2, "val");
		map3.put(1, "val");
		map3.put(5, "val");
		map3.put(4, "val");
	        
	    Integer highestKey = map3.lastKey();
	    Integer lowestKey = map3.firstKey();
	    Set<Integer> keysLessThan3 = map3.headMap(3).keySet();
	    Set<Integer> keysGreaterThanEqTo3 = map3.tailMap(3).keySet();
	    
	    
	    System.out.println("highestKey"+" "+highestKey);
	    System.out.println("lowestKey"+" "+lowestKey);
	    
	    

	}

}
