package com.mx.interview.question3;

public class Test2 {

	//28836 3 9457	9613
	
	public static void main(String[] args) {
	    
		int n = 0; // to spend
		int c = 0; //
		int m = 0; // wrappers
		int r = 0;

		//int [] x = {28836, 3 ,9457,	9613};
		int[] x = { 69775, 1, 12212,	69780};
		
		n = x[0];
		c = x[1];
		m = x[2];
		r = x[3];

		int d = chocolateFeast(n, c, m);
		
		System.out.println("d"+ "  " + d);
		
	    
	}
	
	 static int chocolateFeast(int n, int c, int m) {
	        int wrapper=0;
	        wrapper=n/c; 
	        int choc_count=wrapper;
					
	        while(wrapper>=m)
	        {  
	            wrapper=wrapper-m;//exchange
	            wrapper++;//new choc wrapper..  so ++
	            choc_count++;//increase choc count
	        }
	        return choc_count;
	    }
	 
	 
	
	
}
