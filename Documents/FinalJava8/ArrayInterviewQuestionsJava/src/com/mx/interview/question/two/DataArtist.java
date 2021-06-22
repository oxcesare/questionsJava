package com.mx.interview.question.two;

public class DataArtist {

	public void draw(String s) {
		System.out.println("String");
	}

	public void draw(int i) {
		System.out.println("int");
	}

	public void draw(double f) {
		System.out.println("Double");
	}

	public void draw(int i, double f) {
		System.out.println("Metodo con dos parametros");

	}

	public static void main(String[] args) {

		DataArtist artist = new DataArtist();
		artist.draw(7, 7);
		artist.draw("X");
	}

}
