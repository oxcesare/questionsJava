package com.mx.interview.question.two;

public class Test3 {
	
	public static void main(String[] args) {
		
		String x = "Hello World";
		String y = "Hello World";
		String z = x;
		
		//Hacen referencia al mismo objeto
		System.out.println(x == z);    // true
		
		System.out.println(x.equals(y)); //true 
		
		
	}

}
