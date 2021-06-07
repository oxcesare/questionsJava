package com.mx.examen.demo.albo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Utilerias {
	
	
	public static final String EDITOR="editor";
	public static final String WRITER="writer";
	public static final String COLORIST="colorist";
	
	public static String formatFechaSincronizacion(Date date) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");  
	    String format= formatter.format(date);  
	    
	    return format;
	}

}
