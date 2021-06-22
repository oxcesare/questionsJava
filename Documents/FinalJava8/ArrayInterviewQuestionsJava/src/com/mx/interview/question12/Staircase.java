package com.mx.interview.question12;

public class Staircase {

	public static void main(String[] args) {
		Staircase.staircase(6);

	}

	public static void staircase(int n) {
		// Write your code here
		StringBuilder c = new StringBuilder();

		for (int i = 0; i < n; i++) {
			c.append(" ");
		}

		for (int i = 1, j = 0; i <= n; i++) {
			c.replace(c.length() - i, c.length() - j, "#");
			System.out.println(c);
			j++;
		}

	}

}
