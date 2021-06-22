package com.mx.interview.question17;


import java.util.*;
import java.util.stream.Collectors;


public class Test4 {

	
	
	public static void main(String[] args) {
	
		
		List<Integer> ints = Arrays.asList(1, 2, -4, 0, 2, 0, -1, 14, 0, -1);
		
		List<Integer> result = ints.stream()
				.filter(i -> i != 0)
				.collect(Collectors.toList());
		
		for (Integer integer : result) {
			System.out.println(integer);
			
		}
		
		
	}
	
	
	
}
