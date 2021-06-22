package com.mx.interview.question17;

public class Test8 {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 5, 2, 8, 3 };

		Test8.bubbleSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
