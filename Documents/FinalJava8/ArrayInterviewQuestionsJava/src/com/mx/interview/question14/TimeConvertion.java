package com.mx.interview.question14;

public class TimeConvertion {

	public static void main(String[] args) {

		String r = TimeConvertion.timeConversion("01:07:08PM");
		
		System.out.println(r);

	}

	public static String timeConversion(String s) {
		// Write your code here

		String pm = s.substring(8, 10);
		String newFormat = "";

		if (pm.equals("PM")) {

			int hour = 0;

			if (s.substring(0, 2).equals("12")) {
				hour = 12;
			} else {
				hour = Integer.parseInt(s.substring(0, 2)) + 12;
			}

			String minute = s.substring(3, 5);

			String second = s.substring(6, 8);

			System.out.println("hour" + " " + hour);

			System.out.println("minute" + " " + minute);

			System.out.println("seconde" + " " + second);

			System.out.println(pm);

			newFormat = String.valueOf(hour).concat(":").concat(minute).concat(":").concat(second);

		} else {

			String hour = s.substring(0, 2);

			String minute = s.substring(3, 5);

			String second = s.substring(6, 8);

			System.out.println("hour" + " " + hour);

			System.out.println("minute" + " " + minute);

			System.out.println("seconde" + " " + second);

			if (hour.equals("12")) {
				hour = "00";
			}

			newFormat = String.valueOf(hour).concat(":").concat(minute).concat(":").concat(second);

		}

		return newFormat;

	}

}
