package com.mx.interview.question17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) {

		String[] arr = { "One", "Two", "Three", "Four", "Five" };

		Stream<String> stream = Arrays.stream(arr);

		stream.filter(s -> s.equals("One")).forEach(System.out::println);

	}

}
