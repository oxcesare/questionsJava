package com.mx.interview.question14;

public class Anagram {

	public static void main(String[] args) {

		String s = "fdhlvosfpafhalll";
		int r = Anagram.anagram(s);

		System.out.println(r);
	}

	public static int anagram(String s) {
		// Write your code here
		int changes = 0;

		if (s.length() % 2 == 0) {
			int d = s.length() / 2;

			String x = s.substring(0, d);
			// System.out.println(x);

			String y = s.substring(d, s.length());
			// System.out.println(y);

			for (int i = 0; i < x.length(); i++) {
				char c = x.charAt(i);
				String t = String.valueOf(c);
				int r = y.indexOf(c);
				System.out.println(r);

				if (y.contains(t)) {

				} else {

					changes++;
				}
			}

		} else {
			changes = -1;
		}

		return changes;

	}

}
