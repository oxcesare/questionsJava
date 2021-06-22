package com.mx.interview.question3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DayProgrammer {

	public static void main(String[] args) {

		// 2017

		int january=31;
		int february=28;
		int march=31;
		int april=30;
		int may=31;
		int june=30;
		int july=31;
		int august=31;
		
		
		
		LocalDate date = LocalDate.of(2004, Month.JANUARY, 1);
		boolean isLeap = date.isLeapYear();

		System.out.println("isLeap" + " " + isLeap);

		if(isLeap) {
			february=29;
		}else {
			
		}
		
		int total =january+february+march+april+may+june+july+august;
		
		System.out.println("total"+total);
		
		
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());

		c.set(2017, (12 - 1), 05);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int month = c.get(Calendar.MONTH);

		System.out.println("dayOfWeek" + " " + dayOfWeek);
		System.out.println("month" + " " + month);
	}

}
