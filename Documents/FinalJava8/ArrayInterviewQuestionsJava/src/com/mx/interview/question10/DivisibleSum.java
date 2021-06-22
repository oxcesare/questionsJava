package com.mx.interview.question10;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSum {

	public static void main(String[] args) {

		int k = 21;

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(64);
		ar.add(95);
		ar.add(76);
		ar.add(35);
		ar.add(83);
		ar.add(2);
		ar.add(97);
		ar.add(21);
		ar.add(26);
		ar.add(6);
		ar.add(20);
		ar.add(98);
		ar.add(100);
		ar.add(79);
		ar.add(84);
		ar.add(40);
		
		ar.add(62);
		ar.add( 62);
		ar.add( 20);
		ar.add( 9 );
		ar.add(87 );
		ar.add( 40);
		ar.add(47 );
		ar.add( 38);
		ar.add( 12);
		ar.add(10 );
		
		ar.add(92 );
		ar.add(68 );
		ar.add(4);
		ar.add(34 );
		ar.add(98 );
		ar.add(53  );
		
		ar.add(15);
		ar.add(4);
		ar.add(9);
		ar.add(4);
		ar.add(77);
		ar.add(60);
		ar.add(36);
		ar.add(49);
		ar.add(10);
		
		ar.add(73);
		ar.add(56);
		ar.add(43);
		ar.add(31);
		ar.add(6);
		ar.add(18);
		ar.add(91);
		ar.add(53);
		
		ar.add(73);
		ar.add( 28);
		ar.add(90);
		ar.add(79);
		ar.add(3);
		ar.add(72);
		ar.add(64);
		ar.add(29);
		ar.add(89);
		ar.add(95);
		ar.add(28);
		ar.add(23);
		ar.add(7);
		ar.add(54);
		ar.add(23);
		ar.add(34);
		ar.add(90);
		
		
		ar.add(100);
		ar.add(73);
		ar.add(77);
		ar.add(98);
		ar.add(95);
		ar.add(89);
		ar.add(22);
		ar.add(42);
		ar.add(98);
		ar.add(39);
		
		ar.add(92);
		ar.add(25);
		ar.add(44 );
		ar.add(40);
		ar.add(7);
		ar.add(100);
		
		ar.add(62);
		ar.add(28);
		ar.add(25);
		ar.add(21);
		ar.add(64);
		ar.add(55);
		ar.add(84);
		ar.add(54);
		ar.add(99);
		ar.add(14);
		
		ar.add(5);
		ar.add(51);
		ar.add(34);
		ar.add(66);
		ar.add(4);
		ar.add(5);
		ar.add(49);
		ar.add(56);
		
		int r = divisibleSumPairs(5, k, ar);

		System.out.println(r);

	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

		int sum = 0;
		int cont = 0;

		for (int i = 0; i < ar.size(); i++) {
			sum = 0;
			int num1 = ar.get(i);
			for (int j = 0; j < ar.size(); j++) {
				if (j + 1 >= ar.size()) {
					break;
				} else {
					int num2 = ar.get(j + 1);
					if (num1 < num2) {
						sum = num1 + num2;
						if (sum % k == 0) {							
							//System.out.println("Sumas Completadas " + " " + " num1 : " + num1 + " " + "num2 : " + num2
							//		+ " =" + sum);
							cont++;
						}
					}
				}

			}

		}

		return cont;

	}

}
