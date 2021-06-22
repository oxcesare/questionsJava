package com.mx.interview.question12;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateTimeStamp {
	
	public static void main(String[] args) throws ParseException {
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("03/06/2021");
		long time = date.getTime();
		new Timestamp(time);
		System.out.println(time);
	}

}
