package com.mx.interview.question5;

public class Test7 {

	public static void main(String[] args) {
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException(); //Invoca a la exception IllegalArgumentException 
		} catch (IllegalArgumentException e) {
			System.out.print("c");
			throw new RuntimeException("1");
		} catch (RuntimeException e) { // este bloque ya nos se ejecuta porque ya se cacho la exception
			System.out.print("d");
			throw new RuntimeException("2");
		} finally { // el bloque finally siempre se ejecuta 
			System.out.print("e");
			throw new RuntimeException("3");
		}
	}

}
