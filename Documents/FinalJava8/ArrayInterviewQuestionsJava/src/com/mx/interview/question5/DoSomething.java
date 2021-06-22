package com.mx.interview.question5;

import java.io.IOException;

public class DoSomething {

	public void go() {
		System.out.print("A");
		try {
			stop();
		} catch (ArithmeticException e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public void stop() {
		System.out.print("E");
		Object x = null;
		x.toString();
		System.out.print("F");
	}

	public void p() throws RuntimeException {

	}

	public void a() throws IOException {
		throw new java.io.IOException();
	}

	public void b() throws IOException {
		throw new RuntimeException();

	}

	/**
	 * Se puede declara un metodo con Exception como tipo de retorno
	 * 
	 * @return
	 */
	public Exception exception() {

		return new Exception();
	}

	public static void main(String[] args) {
		new DoSomething().go();
	}
}
