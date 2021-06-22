package com.mx.interview.question17;

import java.util.Optional;

public class TestUser {

	public static void main(String[] args) {
		
		
		/**
		 * Emmpty Value
		 */
		Optional<User> userOptional = Optional.empty();
		
		
		/**
		 * non-empty Optional
		 */
		User user = new User();
		Optional<User> userOptional2 = Optional.of(user);
		
		
		
		
		
		
		
	}
	
	
	public void mensaje() {
		System.out.println("Hola");
	}

}
