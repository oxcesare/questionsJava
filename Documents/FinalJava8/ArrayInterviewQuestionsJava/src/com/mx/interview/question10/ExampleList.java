package com.mx.interview.question10;

import java.util.*;

public class ExampleList {

	
	public static void main(String[] args) {
		
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		
	    for (Integer integer : a) {
			System.out.println(integer);
		}
	    
	    
	    a.remove(a.size()-1);
	    
	    System.out.println("************************");
	    
	    for (Integer integer : a) {
			System.out.println(integer);
		}
	    
	    System.out.println("************************");
	    
	    
	    a.add(0, 5);
	    
	    for (Integer integer : a) {
			System.out.println(integer);
		}
	    
	}
	
	
	
}
