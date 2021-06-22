package com.mx.interview.question14;

import java.util.*;

public class BirthdayCake {

	public static void main(String[] args) {
		
		List<Integer> candles = new ArrayList<Integer>();
		candles.add(3);
		candles.add(2);
		candles.add(1);
		candles.add(3);
		
		
		int r = BirthdayCake.birthdayCakeCandles(candles);
		
		System.out.println(r);

	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here

		Integer max = candles
			      .stream()
			      .mapToInt(v -> v)
			      .max().orElseThrow(NoSuchElementException::new);
		
		int r = (int) candles.stream().filter(i -> i>= max).count();
		
		
		
		return r;

	}

}
