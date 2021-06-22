package com.mx.interview.question4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		/**
		 * Create ArrayList with Optional
		 */
		List<Optional<String>> listOfOptionals = Arrays.asList(Optional.empty(), Optional.of("foo"), Optional.empty(),
				Optional.of("bar"));

		/**
		 * Using filter
		 */

		List<String> filteredList = listOfOptionals.stream().filter(Optional::isPresent).map(Optional::get)
				.collect(Collectors.toList());

		for (String data : filteredList) {
			System.out.println("data: " + data);
		}

		/**
		 *
		 * List<String> filteredList2 = listOfOptionals.stream().flatMap(o ->
		 * o.map(Stream::of).orElseGet(Stream::empty)) .collect(Collectors.toList());
		 */

		Optional<String> optional1 = Optional.of("javaone");
		if (optional1.isPresent()) {
			String value = optional1.get();
		}

	}
}
