package com.mx.interview.question8;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

public class Test1 {

	public static void main(String[] args) {

		String c = "".concat("");

		LocalDate date = LocalDate.of(2018, Month.APRIL, 28);
		date.plusDays(2);//Si se pasa de dias, llega al tope y ya no suma más 

		System.out.println(date.plusDays(2));
		try {
			System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
			
			System.out.println(date.getDayOfMonth());
		} catch (DateTimeException e) {
			System.out.println(e.getCause());
			throw new DateTimeException("Año - Mes y dia invalido");
		}
		
		for (String string : args) {
			
		}

	}

}
