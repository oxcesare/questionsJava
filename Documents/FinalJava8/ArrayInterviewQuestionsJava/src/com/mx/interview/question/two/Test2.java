package com.mx.interview.question.two;

public class Test2 {

	public static void main(String[] args) {

		Integer[] x = { 1,2,4,5};
		Integer sum = 0;
		Integer expectSum = 15;

		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}

		System.out.println("Sum" + " " + sum);
		System.out.println("expectSum" + " " + expectSum);
		System.out.println("Difference"+ " " + (expectSum-sum));

	}

}
