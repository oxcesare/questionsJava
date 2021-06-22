package com.mx.interview.question7;

public class Test1 {
	
	
	public static void main(String[] args) {
		
		
		//StringBuilder name = "rumble"; //Manera incorrecta de crear un StringBuilder
		
		//name.append(4).deleteCharAt(3).deleteCharAt(3, name.length()-1); // delteCharAt solo recibe un parametro
		
		
		StringBuilder b = new StringBuilder("rumble");
		
		b.append(4).deleteCharAt(3).deleteCharAt(b.length()-1);
		
		System.out.println(b);
		
	}

}
