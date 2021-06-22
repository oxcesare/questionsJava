package com.mx.interview.question8;

public class Beautiful {

	public static void main(String[] args) {

		String b = "0101010";

		// System.out.println(b.substring(0, 3));
		// System.out.println(b.substring(4, 7));

		int step = beautifulBinaryString(b);
		System.out.println(step);

	}

	public static int beautifulBinaryString(String b) {
		// Write your code here

		int step = 0;

		for (int i = 0; i < b.length(); i++) {
			if (i + 3 > b.length()) {
				break;
			} else {
				if (b.substring(i, i + 3).equals("010")) {
					i += 2;
					step++;
				}

			}

		}

		return step;

	}
}
