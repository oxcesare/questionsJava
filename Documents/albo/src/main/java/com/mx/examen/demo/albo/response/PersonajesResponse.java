package com.mx.examen.demo.albo.response;

import java.util.List;

public class PersonajesResponse {
	
	
	private String last_sync;
	private String character;
	private List<String> comics;
	
	
	public String getLast_sync() {
		return last_sync;
	}
	public void setLast_sync(String last_sync) {
		this.last_sync = last_sync;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public List<String> getComics() {
		return comics;
	}
	public void setComics(List<String> comics) {
		this.comics = comics;
	}
	
	
	

}
