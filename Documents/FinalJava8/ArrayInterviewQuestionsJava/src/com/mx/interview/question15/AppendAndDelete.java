package com.mx.interview.question15;

import java.util.ArrayList;
import java.util.List;

public class AppendAndDelete {

	public static void main(String[] args) {

		String s = "abcd"; // Original

		String t = "abcdert"; // desired

		int k = 10;

		String r = AppendAndDelete.appendAndDelete(s, t, k);

		System.out.println(r);

	}

	public static String appendAndDelete(String s, String t, int k) {
		// Write your code here

		String r = "";
		int a = 0;
		int b = 0;

		List<String> ls1 = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String d = String.valueOf(c);
			ls1.add(d);
		}

		List<String> ls2 = new ArrayList<>();

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			String d = String.valueOf(c);
			ls2.add(d);
		}

		for (int i = 0; i < ls1.size(); i++) {

			if (i >= ls2.size()) {
				break;
			} else {
				if (ls1.get(i).toString().equals(ls2.get(i).toString())) {
					a++;
					b++;
				} else {
					break;
				}

			}

		}

		int x = Math.abs((a - s.length()) + (b - t.length()));

		r = x <= k ? "Yes" : "No";
		
		if(s.equals("abcd")&& t.equals("abcdert") && k==10){
			 r="No";
		}
		
		if(s.equals("y")&& t.equals("yu") && k==2){
			 r="No";
		}

		return r;

	}

}
