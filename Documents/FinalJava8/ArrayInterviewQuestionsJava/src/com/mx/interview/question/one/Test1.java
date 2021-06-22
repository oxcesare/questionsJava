package com.mx.interview.question.one;

import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {

		Integer[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		Integer[] y = new Integer[x.length];

		Test1 test1 = new Test1();
		test1.bubbleSort(x);

		for (int i = 0; i < x.length; i++) {
			y[i] = x[i];
		}

		System.out.println("First" + " " + y[0]);
		System.out.println("Last" + " " + y[y.length - 1]);
	}

	void bubbleSort(Integer[] arr) {
		int n = arr.length;
		IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
			if (arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		});
	}

}
