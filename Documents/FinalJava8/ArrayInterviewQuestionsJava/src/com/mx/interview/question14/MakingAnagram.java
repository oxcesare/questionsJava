package com.mx.interview.question14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakingAnagram {

	public static void main(String[] args) {

		String a = "abc";
		String b = "def";

		int res = MakingAnagram.makeAnagram(a, b);

		System.out.println(res);
	}

	public static int makeAnagram(String a, String b) {
		
		int[] alfabet = new int[26];
	
		a.chars().forEach((c) -> {
			alfabet[c - 97]++;
		});

		b.chars().forEach((c) -> {
			alfabet[c - 97]--;
		});

		return Arrays.stream(alfabet).map(Math::abs).sum();
	}

}
