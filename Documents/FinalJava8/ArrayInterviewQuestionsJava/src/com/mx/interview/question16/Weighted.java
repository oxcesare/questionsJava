package com.mx.interview.question16;

import java.util.*;

public class Weighted {

	public static void main(String[] args) {

		String s = "aaabbbbcccddd";
		List<Integer> queries = new ArrayList<Integer>();
		queries.add(9);
		queries.add(7);
		queries.add(8);
		queries.add(12);
		queries.add(5);

		Weighted.weightedUniformStrings(s, queries);

	}

	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
		// Write your code here

		List<String> result = new ArrayList<String>();
		List<Integer> resu = new ArrayList<Integer>();

		int t = 0;

		// Create Set

		Set<String> set = new TreeSet<String>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String d = String.valueOf(c);
			set.add(d);
		}

		int x = 0;
		for (String string : set) {

			String l = string.toString();
			for (int j = 0; j < s.length(); j++) {
				char e = s.charAt(j);
				String f = String.valueOf(e);
				if (l.equals(f)) {
					int p = findValue(string);

					t++;
					if (t > 1) {
						x = x + p;
						resu.add(x);
					} else {
						x = p;
						resu.add(x);
					}

				}
			}
			x = 0;
			t = 0;
		}

		for (int i = 0; i < queries.size(); i++) {

			if (resu.contains(queries.get(i))) {
				result.add("Yes");
			} else {
				result.add("No");
			}
		}

		return result;

	}

	public static int findValue(String d) {

		int x = 0;

		switch (d) {
		case "a":
			x = 1;
			break;
		case "b":
			x = 2;
			break;
		case "c":
			x = 3;
			break;
		case "d":
			x = 4;
			break;
		case "e":
			x = 5;
			break;
		case "f":
			x = 6;
			break;
		case "g":
			x = 7;
			break;
		case "h":
			x = 8;
			break;
		case "i":
			x = 9;
			break;
		case "j":
			x = 10;
			break;
		case "k":
			x = 11;
			break;
		case "l":
			x = 12;
			break;
		case "m":
			x = 13;
			break;
		case "n":
			x = 14;
			break;
		case "o":
			x = 15;
			break;
		case "p":
			x = 16;
			break;
		case "q":
			x = 17;
			break;
		case "r":
			x = 18;
			break;
		case "s":
			x = 19;
			break;
		case "t":
			x = 20;
			break;
		case "u":
			x = 21;
			break;
		case "v":
			x = 22;
			break;
		case "w":
			x = 23;
			break;
		case "x":
			x = 24;
			break;
		case "y":
			x = 25;
			break;
		case "z":
			x = 26;
			break;
		default:
			break;
		}

		return x;

	}

}
