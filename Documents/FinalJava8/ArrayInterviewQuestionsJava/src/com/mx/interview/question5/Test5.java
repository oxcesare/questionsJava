package com.mx.interview.question5;

public class Test5 {

	public static void main(String[] args) {

	}
	
	
	/**
	 * 
	 * @return
	 * 
	 * Manda error porque ArithmeticException es subclase de RuntimeException
	 * 
	 * ademas de que recordemos que va de la más especifica a la más generica 
	 * 
	 * Se comenta el error a modo de que la clase no mande error de compilación 
	 */
	
	public int getM() {
		
		int a=0;
		int b=0;

		try {
			return a / b;
		} catch (RuntimeException e) {
			return -1;
		} 
		//catch (ArithmeticException e) {
		//	return 0;
		//} 
	   finally {
			System.out.print("done");
		}
	}

}
