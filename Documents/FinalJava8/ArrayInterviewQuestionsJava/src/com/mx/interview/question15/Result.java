package com.mx.interview.question15;

import java.util.HashMap;
import java.util.Map;

public class Result {

	public static void main(String[] args) {

		String password = "xnnpmuduhznoaquudhavrncwfwujycmiggjmcmkkbnjfeodxkgjgwxtrxingiqquhuwqhdswxxrxuzzfhkplwunfagppcoildagk";
		int weight_a = 19;

		//Espera 1227
		
		int k = getStrength(password, weight_a);

		System.out.println(k);

	}

	public static int getStrength(String password, int weight_a) {
		// Complete the function
		int sum = 0;

		String x = "abcdefghijklmnopqrstuvwxyz";

		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0, j = weight_a; i < x.length(); j++, i++) {

			char c = x.charAt(i);
			String f = String.valueOf(c);

			if (j > 25) {
				j = 1;
				weight_a = 0;
				map.put(j, f);
				weight_a++;
			} else {
				map.put(j, f);
			}
		}

		for (int i = 0; i < password.length(); i++) {

			char c = password.charAt(i);
			String f = new String(String.valueOf(c));

			for (Map.Entry<Integer, String> t : map.entrySet()) {

				if (t.getValue().equals(f)) {
					System.out.println("value"+" "+ t.getValue());
					sum += t.getKey();
					break;
				}

			}

		}

		return sum;

	}

}
