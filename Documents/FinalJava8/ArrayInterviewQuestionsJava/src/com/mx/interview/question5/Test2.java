package com.mx.interview.question5;

import java.util.function.Supplier;

public class Test2 {

	public static void main(String[] args) {

		Supplier<Test2> test2 = () -> new Test2();
		test2.get().mensaje();

		test2.get().otroMensaje();

	}

	public void mensaje() {
		System.out.println("Mensaje");
	}

	public void otroMensaje() {
		System.out.println("Otro Mensaje");
	}
}
