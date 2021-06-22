package com.mx.interview.question17;

import java.util.*;

public class Test6 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ann a 15", "Mir el 28", "D oru 33");
		
		
		 List<String> resultWs = replace(
				    names, (String s) -> s.replaceAll("\\s", ""));
				  
		 List<String> resultNr = replace(
				    names, (String s) -> s.replaceAll("\\d", ""));
				  
		for (String element : resultNr) {
			System.out.println(element);			
		}		  
		
		System.out.println("********************************");
		
		
		for (String element : resultWs) {
			System.out.println(element);
		}

	}
	
	
    /**
     * 
     * @param list
     * @param r
     * @return
     * 
     * Toma como parametro una expresión lambda 
     */
	public static List<String> replace(List<String> list, Replacer<String> r) {
		List<String> result = new ArrayList<>();
		for (String s : list) {
			result.add(r.replace(s));
		}
		return result;
	}

}
