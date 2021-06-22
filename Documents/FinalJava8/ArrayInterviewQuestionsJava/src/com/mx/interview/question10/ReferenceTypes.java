package com.mx.interview.question10;

public class ReferenceTypes {
	public void fly(String s) {
		System.out.print("string ");
	}

	public void fly(Object o) {
		System.out.print("object ");
	}

	public static void main(String[] args) {
		ReferenceTypes r = new ReferenceTypes();
		r.fly("test");
		r.fly(56); //Paso por referencia
		r.fly(16.6);
	}
}
