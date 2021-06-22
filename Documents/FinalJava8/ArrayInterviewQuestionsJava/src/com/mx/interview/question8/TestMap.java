package com.mx.interview.question8;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	
	public static void main(String[] args) {

		Map<String, Integer> lsAlumnos = new HashMap<String, Integer>();
		lsAlumnos.put("Cesar", 90);
		lsAlumnos.put("Ricardo", 90);
		lsAlumnos.put("Jose", 90);
		lsAlumnos.put("Cesar", 90);
		lsAlumnos.put("Gil", 90);
		lsAlumnos.put("Lupita", 90);

		for (Map.Entry<String, Integer> ls : lsAlumnos.entrySet()) {
			System.out.println(ls.getKey() + ":" + ls.getValue());
		}

	}

}
