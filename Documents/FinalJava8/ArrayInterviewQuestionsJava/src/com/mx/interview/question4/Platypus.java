package com.mx.interview.question4;


class Mammal {
	
	public Mammal(int age) {
	     System.out.println("Mammal");
	}
	
}
public class Platypus extends Mammal {

	
	/**
	 * Se utiliza la palabra reservada super para invocar al constructor 
	 * de la clase Padre 
	 */
	public Platypus() {
		super(5);
		System.out.println("Platypus");
	}
	
	public static void main(String[] args) {
		new Mammal(5);
	}
	
}
