package com.mx.interview.question5;

/**
 * 
 * @author cesaralducinruiz
 * 
 *         en una clase abstracta puedo tener metodos abstractos y no abstractos
 * 
 *         y será solo los abtractos los que tenga que implementar en la clase
 *         que herede de la clase abstracta
 *
 */
public abstract class Bird {

	private void fly() {
		System.out.println("Bird is flying");
	}

	public abstract void mensaje();

	public static void main(String[] args) {

		Bird bird = new Pelican();
		bird.fly();

	}

}

class Pelican extends Bird {

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub

	}

	protected void fly() {
		System.out.println("Bird is Pelican");
	}

}
