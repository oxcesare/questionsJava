package com.mx.interview.question4;

/**
 * 
 * @author cesaralducinruiz
 *
 */

public class TimeInWords {

	public static void main(String[] args) {

		int h = 1;
		int m = 1;
		String x = timeInWords(h, m);

		System.out.println(x);

	}

	public static String timeInWords(int h, int m) {

		String[] toNineTeen = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		String[] toAllRestNumbers = { " ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		int l = 0;
		String result = "";

		if (m == 0) {

			result = toNineTeen[h - 1] + " " + "o' clock" ;
		} else if (m <= 1 || m <= 30) {

			String n = String.valueOf(m);

			if (n.length() == 1) {
				l = Integer.parseInt(n);
				result = toNineTeen[l - 1] + " " + "minute" + " " + "past" + " " + toNineTeen[h - 1];
			} else if (m == 30) {

				result = "half" + " " + "past" + " " + toNineTeen[h - 1];
			} else if (m == 15) {
				result = "quarter" + " " + "past" + " " + toNineTeen[h - 1];
			}else if(m==10) {
				result = toNineTeen[m-1]+ " "
						+ "minutes" + " " + "past" + " " + toNineTeen[h - 1];
			}else if(m<=19) {
				
				result = toNineTeen[m-1]+ " "
						+ "minutes" + " " + "past" + " " + toNineTeen[h - 1];
			}else if(m==20) {
				
				String a = n.substring(0, 1);
				
				result = toAllRestNumbers[Integer.parseInt(a)] +" " + "minutes" + " " + "past" + " " + toNineTeen[h - 1];
			}
			else {
				String a = n.substring(0, 1);
				String b = n.substring(1, 2);

				result = toAllRestNumbers[Integer.parseInt(a)] + " " + toNineTeen[Integer.parseInt(b) - 1] + " "
						+ "minutes" + " " + "past" + " " + toNineTeen[h - 1];
			}

		} else if (m == 45) {

			result = "quarter" + " " + "to" + " " + toNineTeen[h];
		} else {

			// 19

			int t = 60 - m;
			String d = String.valueOf(t).substring(0, 1);
			String e = t >= 10 ? String.valueOf(t).substring(1, 2) : "";

			if (t < 20) {
				result = toNineTeen[t - 1] + " " + "minutes" + " " + "to" + " " + toNineTeen[h];
			} else if (t == 20) {
				result = toAllRestNumbers[Integer.parseInt(d)] + " " + "minutes" + " " + "to" + " " + toNineTeen[h];
			}

			else {
				result = toAllRestNumbers[Integer.parseInt(d)] + " " + toNineTeen[Integer.parseInt(e) - 1] + " "
						+ "minutes" + " " + "to" + " " + toNineTeen[h];

			}

		}

		return result;

	}

}
