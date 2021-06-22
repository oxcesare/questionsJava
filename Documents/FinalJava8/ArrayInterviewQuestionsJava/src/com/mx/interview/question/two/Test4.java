package com.mx.interview.question.two;

public class Test4 {

	public static void main(String[] args) {

		// int[] odd = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,21,23,25,27,29,31 };

		int[] odd = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33 };
		
		int sum = 0;

		System.out.println("odd.length" + " " + odd.length);
		/**
		 * 0-1
		 * 1-3 
		 * 3-6 
		 * 10-15
		 * 15-20
		 */

		int t1 = odd[0];
		System.out.println("t1" + " " + t1);

		System.out.println("***********************");

		int t2 = odd[1];
		System.out.println("t2" + " " + t2);

		int t3 = odd[2];
		System.out.println("t3" + " " + t3);

		System.out.println("***********************");

		int t4 = odd[3];
		System.out.println("t4" + " " + t4);

		int t5 = odd[4];
		System.out.println("t5" + " " + t5);

		int t6 = odd[5];
		System.out.println("t6" + " " + t6);

		System.out.println("***********************");

		int t7 = odd[6];
		System.out.println("t7" + " " + t7);

		int t8 = odd[7];
		System.out.println("t8" + " " + t8);

		int t9 = odd[8];
		System.out.println("t9" + " " + t9);

		int t10 = odd[9];
		System.out.println("t10" + " " + t10);

		System.out.println("********************");

		int t11 = odd[10];
		System.out.println("t11" + " " + t11);

		int t12 = odd[11];
		System.out.println("t12" + " " + t12);

		int t13 = odd[12];
		System.out.println("t13" + " " + t13);

		int t14 = odd[13];
		System.out.println("t14" + " " + t14);

		int t15 = odd[14];
		System.out.println("t15" + " " + t15);

		System.out.println("********************");

		
		for (int i = 0; i <1; i++) {
			sum += odd[i];
		}
		System.out.println("sum" + " " + sum);
		sum=0;
		for (int i = 1; i <3; i++) {
			sum += odd[i];
		}
		System.out.println("sum" + " " + sum);
		sum = 0;

		for (int i = 3; i < 6; i++) {
			sum += odd[i];
		}
		System.out.println("sum" + " " + sum);
		sum = 0;

		for (int i = 6; i <10 ; i++) {
			sum += odd[i];
		}
		System.out.println("sum" + " " + sum);
		
		sum=0;
		
		for (int i = 10; i <15 ; i++) {			
			sum += odd[i];
		}
		System.out.println("sum" + " " + sum);
		sum=0;
		
		System.out.println("Creo ya");
		
		int t=0;
		int d=0;
		for (int i = 0, c=1; i < odd.length; i++,c++ ) {
			 
			
			
		}
	}

}
