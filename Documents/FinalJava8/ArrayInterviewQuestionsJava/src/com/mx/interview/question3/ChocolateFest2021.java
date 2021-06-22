package com.mx.interview.question3;

public class ChocolateFest2021 {

	public static void main(String[] args) {

		int n = 0; // to spend
		int c = 0; //
		int m = 0; // wrappers
		int r = 0;

		// int[] x = { 10, 2, 5, 6 };
		// int[] x = { 12, 4, 4, 3 };
		// int[] x = { 6, 2, 2, 5 };
		// int[] x = { 65874, 14362, 15922, 4 };
		   //int[] x = { 43203, 60, 5, 899 };
		int [] x = {28836, 3 ,9457,	9613};

		n = x[0];
		c = x[1];
		m = x[2];
		r = x[3];

		int total = chocolateFeast(n, c, m);

		System.out.println("Total" + " " + total);

		if (total == r) {
			System.out.println("Exitoso");
		} else {
			System.out.println("No Exitoso");

		}

	}

	public static int chocolateFeast(int n, int c, int m) {

		int buy = 0;
		int intercambio = 0;
		int insideWrapper = 0;

		buy = n / c;
		int total = 0;
		int d = 0;
		int buy1 = 0;
		int inter = 0;
		
		insideWrapper = buy / m;

		if (insideWrapper == 0) {
			total = buy;			
		} else if (insideWrapper < 0) {
			total = buy;
		} else {

			intercambio = (buy / m);
			intercambio += DifferenceWrapper(intercambio, m, buy);
			inter = intercambio;

			while (intercambio > m) {
				buy1 = intercambio;
				intercambio = intercambio / m;
				d = DifferenceWrapper(intercambio, m, buy1);
				intercambio += d;
				inter += intercambio - d;
			}
		}

		total = inter + buy;

		return total;
	}

	public static int DifferenceWrapper(int r, int m, int buy1) {

		int dif = 0;

		dif = buy1 - (r * m);

		return dif;
	}

}
