package com.mx.interview.question15;

import java.util.Optional;
import java.util.function.Predicate;

public class ExampleOfPredicate {

	public static void main(String[] args) {

		Predicate<String> c = new Predicate<String>() {

			@Override
			public boolean test(String t) {

				if (t.equals("ABC")) {
					return true;
				}

				return false;
			}
		};

		System.out.println(c.test("ABC"));
		
		
		//
		
		Optional<String> x = Optional.of("ABC");
		
		
		if(x.isPresent()) {
			System.out.println("Something");
		}else {
			System.out.println("Something Other");
		}
	}
}
