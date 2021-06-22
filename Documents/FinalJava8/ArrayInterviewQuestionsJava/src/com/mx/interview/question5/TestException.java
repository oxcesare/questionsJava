package com.mx.interview.question5;

public class TestException extends Exception {

	/**
	 * 
	 * @param args
	 * @throws NoMoreCarrotsException
	 * 
	 *                                La exception NoMoreCarrotsException debe ser
	 *                                declarada dentro del metodo Main
	 * 
	 *                                Si heredas de una clase que que tiene una
	 *                                excption declarada no puedes desde una
	 *                                subclase declarar una de menor nivel.
	 */
	public static void main(String[] args) throws NoMoreCarrotsException {
		eatCarrot();

	}

	private static void eatCarrot() throws NoMoreCarrotsException {

	}

}
