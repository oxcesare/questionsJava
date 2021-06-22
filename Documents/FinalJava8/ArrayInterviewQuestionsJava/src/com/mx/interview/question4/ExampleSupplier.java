package com.mx.interview.question4;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ExampleSupplier {

	public static void main(String[] args) {

		exampleMethod();

	}

	private static void exampleMethod() {

		Supplier<LocalDate> date = () -> LocalDate.now();

		System.out.println(date.get());

		LocalDate local = LocalDate.now();

		System.out.println(local);
	}
}
