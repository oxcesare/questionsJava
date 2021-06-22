package com.mx.interview.question5;

public class Test4 {
	
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			throw new ArithmeticException("Mensaje inside");
		}
		
		
	}

}
