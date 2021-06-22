package com.mx.interview.question14;

import java.util.ArrayList;
import java.util.List;

public class Example {

	
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(30);
		ar.add(50);
		ar.add(10);
		ar.add(20);
		
		int k=10;
		
		Integer d = new Integer(k);
		for (Integer integer : ar) {
			
			if(d.equals(integer)) {
				System.out.println("contiene"+integer);
			}else {
				
			}
		}
		
		
	}
}
