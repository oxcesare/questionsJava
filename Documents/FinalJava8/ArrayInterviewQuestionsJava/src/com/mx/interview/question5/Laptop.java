package com.mx.interview.question5;

public class Laptop {
	public void start() {
		try {
			System.out.print("Starting up ");
			throw new Exception(); // Invoca la Exception
		} catch (Exception e) {
			System.out.print("Problem ");
			System.exit(0); //Esto hace que el programa termine 
		} finally {
			System.out.print("Shutting down ");
		}
	}

	public static void main(String[] args) {
		new Laptop().start();
	}
}
