package com.mx.examen.demo.albo.service;

import java.util.List;

import com.mx.examen.demo.albo.entity.Personajes;
import com.mx.examen.demo.albo.response.PersonajesResponse;

public interface PersonajesService {
	
	
	public void save (Personajes personajes);
	
	public List<Personajes> listPersonales();
	
	public PersonajesResponse listHeroe(String heroe);
	
	
	
	

}
