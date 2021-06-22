package com.mx.interview.question15;

import java.util.ArrayList;
import java.util.List;

public class ExampleContains {

	public static void main(String[] args) {

		String s = "rhackerank";

		String r = ExampleContains.hackerrankInString(s);

		System.out.println(r);

	}

	public static String hackerrankInString(String s) {

		// Write your code here

		String a = "hackerrank";
		int l = a.length();
		int f = 0;
		String r = "";

		List<String> ls1 = new ArrayList<String>();

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			String d = String.valueOf(c);
			ls1.add(d);

		}

		List<String> ls2 = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String d = String.valueOf(c);
			ls2.add(d);

		}

		int g=0;
		int aux=0;
		for (int i = 0; i < ls1.size(); i++) {

			String c = ls1.get(i).toString();
			
			
			for (int j = g; j < ls2.size(); j++,g++) {
				 
				String p = ls2.get(j);
				
				if(c.equals(p)) {
					aux++;
					break;
				}
				
			}

		}

		if (aux == a.length()) {
			r = "YES";
		} else {
			r = "NO";
		}

		return r;

	}

}
