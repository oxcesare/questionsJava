package com.mx.interview.question3;

import java.util.ArrayList;
import java.util.List;

public class Subarray {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(1);
		ls.add(3);
		ls.add(2);
		

		Object[] x = new Object[ls.size()];

		x = ls.toArray();

		
		int d = 3;
		int m = 2;
		
		
		int t = createSum(ls, d, m);
		System.out.println("T" + " " + t);
		
		
		int b = birthday(ls, d, m);
		
		System.out.println("b"+ " " + b);

	}

	static int birthday(List<Integer> s, int d, int m) {
		int sum = 0, ways = 0;
		for (int i = 0; i < m; i++) {
			sum += s.get(i);
		}
		for (int i = 0; i < s.size() - m + 1; i++) {
			if (sum == d) {
				ways++;
			}
			if (i + m < s.size()) {
				sum = sum - s.get(i) + s.get(i + m);
			}
		}
		return ways;
	}

	public static int createSum(List<Integer> ls, int sumatoria, int mes) {

		int sum = 0;
		int contador = 0;

		Object[] x = new Object[ls.size()];

		x = ls.toArray();

		for (int i = 0, j = 0, c = 0; i < x.length; i++, j++) {
			System.out.print("" + (int) x[i]);
			sum += (int) x[i];
			if (j == (mes - 1)) {
				c++;
				i = c - 1;
				j = 0;
				System.out.println("Sumas parciales" + " " + sum);
				if (sum == sumatoria) {
					contador++;
					sum = 0;
				} else {
					sum = 0;
				}
			}
		}

		if (sum == sumatoria) {
			contador++;
			sum = contador;
		}

		System.out.println("Contador - createSum" + "  " + contador);

		return sum;

	}
}
