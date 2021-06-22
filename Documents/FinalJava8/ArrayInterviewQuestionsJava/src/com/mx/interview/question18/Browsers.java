package com.mx.interview.question18;

public class Browsers {
	
	static class Browser {
		public void go() {
			System.out.println("Inside Browser");
		}
	}
	
	static class FireFox extends Browser{
		
		public void go() {
			System.out.println("Inside FireFox");
		}
	}
	
	static class IE extends Browser{
		@Override
		public void go() {
			System.out.println("Inside IE");
		}
		
	}
	
	public static void main(String[] args) {
		
		Browser b = new FireFox();
		IE e = (IE)b; //error en tiempo de ejecucción porque no se puede hacer el CAST
		e.go();
		
	}

}
