package com.mx.interview.question5;

public class Cat {
	public String name;

	public void parseName() {
    System.out.print("1");
    try {
      System.out.print("2");
      int x = Integer.parseInt(name); //NumberFormatException
      System.out.print("3");
    } catch (NullPointerException e) { //El tipo de exception que se lanza es NumberFormat al no esta capturada mandar error
      System.out.print("4");
    }
    System.out.print("5");
  }

	public static void main(String[] args) {
		Cat leo = new Cat();
		leo.name = "Leo";
		leo.parseName();
		System.out.print("6");
	}
}
