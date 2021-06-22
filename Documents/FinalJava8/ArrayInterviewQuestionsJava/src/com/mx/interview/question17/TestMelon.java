package com.mx.interview.question17;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestMelon {

	public static void main(String[] args) {

		Comparator<Melon> byType = Comparator.comparing(Melon::getType).thenComparing(Melon::getWeight).reversed();

		Melon o1 = new Melon("A", 5);

		Melon o2 = new Melon("B", 7);

		byType.compare(o1, o2);

		List<Melon> melon = new ArrayList<Melon>();
		
		Melon [] m = {new Melon("A", 5),new Melon("A", 5)};
		
		TestMelon.findIndexOfElementObject(m, o1);

	}

	public static <T> int findIndexOfElementObject(T[] arr, T toFind) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(toFind)) {
				return i;
			}
		}
		return -1;
	}

}
