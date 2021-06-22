package com.mx.interview.question17;

import java.util.*;
import java.util.function.*;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (t != null && predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

}
