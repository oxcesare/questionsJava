package com.mx.interview.question17;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test7 {

	
	public static void main(String[] args) {

		List<String> list = List.of("anna", "bob", "christian", "carmen", "rick", "carla");
		list.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		
		System.out.println("***************");
		
		
		IntStream rndInfStream = new Random().ints(1, 100);
		List<Integer> result = rndInfStream.filter(i -> i % 2 == 0).limit(10).boxed().collect(Collectors.toList());
		
		for (Integer element : result) {
			
			System.out.println(element);
			
		}
		
		

	}
}
