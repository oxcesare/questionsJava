package com.mx.interview.question17;

import java.util.*;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {

		Object[] arr = {1,5,7,8,9,3,4,5,6,7};
		
		Stream<Object> f = Test5.toStream(arr);

		System.out.println(f.findAny());
		
		

	}

	public static <T> Stream<T> toStream(T[] arr) {
		return Arrays.stream(arr);
	}

}
