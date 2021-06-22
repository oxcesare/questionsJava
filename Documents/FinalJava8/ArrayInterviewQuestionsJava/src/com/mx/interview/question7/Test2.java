package com.mx.interview.question7;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	
	public static void main(String[] args) {
		
		
		//a nivel objetos Lista o cualquier otro el == hace referencia a objetos 
		// el equals sigue siendo a nivel valor del objeto 
		
		List<String> one = new ArrayList<String>();
		one.add("abce");
		
		List<String> two = new ArrayList<String>();
		two.add("abc");
		
		if(one==two) //Validación a nivel objetos
			System.out.println("A");
		else if( one.equals(two)) //Validaciónn a  nivel contenido
			System.out.println("B");
		else
			System.out.println("C");
		
		
		//Este es un comportamiento a nivel primitivos el uso de == aquí a nivel primitivos
		//son dos objetos diferentes
		int a =0;
		int b =0;
		
		if(a==b) {
			System.out.println("AA");
		}
		
		String c ="1";
		String d ="1";
		
		//Validación a nivel valor de la variable c y d.  
		if(c.equals(d)) {
			System.out.println("BB");
		}
	}
}
