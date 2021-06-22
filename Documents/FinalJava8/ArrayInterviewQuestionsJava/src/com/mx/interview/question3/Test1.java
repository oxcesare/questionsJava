package com.mx.interview.question3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author cesaralducinruiz
 * 
 *         Sherlock and Squares
 *
 */
public class Test1 {

	/**
	 * El detalle que estoy teniendo con este algoritmo es que truena al recorrer
	 * elementos grandes
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Determine the range
		int c = 178809602;
		int d = 330598161;

		//int square = squares(c, d);

		//System.out.println(square);
		
		
		int t = (int)Math.sqrt(7897);
		System.out.println(t);

	}

	public static int squares(int c, int d) {

		int x = 0;

		// Square root for 3 is equals to 1
		// 1*1 = 1

		// Create Array about range ( 3,4,5,6,7,8,9) = 7 positions
		int[] e = new int[d + 1];

		for (int i = c; i < d + 1; i++) {
			e[i] = i;
			int r = (int) Math.sqrt(e[i]);
			if (e[i] == r * r) {
				x++;
			}
		}
		
		return x;
	}

}
