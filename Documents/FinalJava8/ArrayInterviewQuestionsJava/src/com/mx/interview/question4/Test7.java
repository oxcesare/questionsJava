package com.mx.interview.question4;

import java.util.function.Consumer;
import java.util.function.Function;

class ConsumerInterfaceExample {
	static void printMessage(String name) {
		System.out.println("Hello " + name);
	}

	static void printValue(int val) {
		System.out.println(val);
	}
}

public class Test7 {

	public static void main(String[] args) {

		Consumer<String> c = ConsumerInterfaceExample::printMessage;
		c.accept("A");

		Function<Integer, String> intToString = Object::toString;

	}
	
	
	public void m() throws Exception{
		
		try {
			
		} catch (Exception e) {
			throw new Exception();
		}
	}
}
