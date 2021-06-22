package com.mx.interview.question5;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {

		Supplier<Test> test = () -> new Test();

		try {
			test.get().exceptions();
		} catch (Exception e) {

		}
	}

	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before ";

				v.length();
				result += "after ";
				throw new NullPointerException("demo");

			} catch (NullPointerException e) {
				result += "catch";

				System.out.println(e);
				System.out.println(e.getMessage());
				e.printStackTrace();
				throw new RuntimeException(); // Para lanzar una exception en particular
			} finally {
				result += "finally ";

				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";

		}
		return result;
	}

	public String exceptions2() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before ";
				System.out.println(result);
				v.length();
				result += "after ";
				System.out.println(result);
			} catch (NullPointerException e) {
				result += "catch";
				System.out.println(result);
				throw new RuntimeException();
			} finally {
				result += "finally ";
				System.out.println(result);
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
			System.out.println(result);
		}
		return result;
	}

}
