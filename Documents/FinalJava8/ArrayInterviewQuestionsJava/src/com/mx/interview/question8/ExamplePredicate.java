package com.mx.interview.question8;

import java.util.function.Predicate;

public class ExamplePredicate {

	public static void main(String[] args) {

		Predicate<Integer> x = t -> t > 7;

		System.out.println(x.test(10));

		
		
		
	}

}
