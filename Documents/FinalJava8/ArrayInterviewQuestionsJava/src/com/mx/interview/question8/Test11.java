package com.mx.interview.question8;

import java.util.*;

public class Test11 {

	public static void main(String[] args) {

		List<String> x = new ArrayList<String>();
		x.add("A");
		x.add("B");

		
		// Using Java 7 
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}
		
		
		//Using Java 8 
		x.stream().forEach((t) -> {
			
			System.out.println("Java 8 Expresion Lambda "+ t);
			
		}
		);
	}

}
