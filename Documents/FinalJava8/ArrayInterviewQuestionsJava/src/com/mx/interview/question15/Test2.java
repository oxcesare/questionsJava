package com.mx.interview.question15;

import java.util.*;

public class Test2 {

	
	public static void main(String[] args) {
		
		
		List<Integer> order = new ArrayList<Integer>();
		order.add(10);
		order.add(30);
		
		
		int k=40;
		
		int r = Test2.filledOrders(order, k);
		
		System.out.println(r);
		
	}
	
	
	public static int filledOrders(List<Integer> order, int k) {
	    // Write your code here		
		int capacity=0;
		int sum=0;
		int c=0;
		
		
		int [] arr = new int [order.size()];
		 
		for (int i = 0; i < order.size(); i++) {
			arr[i] = order.get(i);
		}
		
		Arrays.sort(arr);
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]<=k) {
				c++;
			}else {
					
			}
			
		}
		
		return c;

	    }

	
	
}
