package com.mx.interview.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {

		List<String> lsA = new ArrayList<String>();
		lsA.add("A");
		lsA.add("B");

		List<String> lsB = new ArrayList<String>();
		lsB.add("C");
		lsB.add("D");
		lsB.addAll(lsA);

		List<String> lsBoth = new ArrayList<String>();
		lsBoth.addAll(lsB);
		
		
		Collections.sort(lsBoth);

		for (String string : lsBoth) {
			System.out.println("Elements" + " " + string);
		}

	}
}
