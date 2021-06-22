package com.mx.interview.question17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		LocalDate today = LocalDate.now();
		LocalDate nextWednesday = 
		today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("Next Wednesday on : " + nextWednesday);
		
		
	}

}
