package com.mx.interview.question8;

import java.util.*;

public class Test10 {

	public static void main(String[] args) {

		List<String> x = new ArrayList<String>();
		x.add("A");
		x.add("B");

		x.stream().forEach(System.out::println);

		x.stream().forEach((t) -> {

			System.out.println(t);
		});

	}

}
