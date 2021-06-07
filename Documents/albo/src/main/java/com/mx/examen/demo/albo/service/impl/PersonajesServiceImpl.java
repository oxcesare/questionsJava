package com.mx.examen.demo.albo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.examen.demo.albo.entity.Personajes;
import com.mx.examen.demo.albo.repository.PersonajesDAO;
import com.mx.examen.demo.albo.response.PersonajesResponse;
import com.mx.examen.demo.albo.service.PersonajesService;
import com.mx.examen.demo.albo.util.Utilerias;

@Service
public class PersonajesServiceImpl implements PersonajesService {

	@Autowired
	private PersonajesDAO personajesDAO;

	@Override
	public void save(Personajes personajes) {
		personajesDAO.save(personajes);
	}

	@Override
	public List<Personajes> listPersonales() {
		return (List<Personajes>) personajesDAO.findAll();
	}

	@Override
	public PersonajesResponse listHeroe(String heroe) {

		List<Personajes> lsPersonajes = personajesDAO.findByHeroe(heroe);

		PersonajesResponse personajeResponse = new PersonajesResponse();

		List<String> comics = new ArrayList<String>(); 

		Set<String> personajes = new TreeSet<>();

		for (Personajes a : lsPersonajes) {
			personajes.add(a.getPersonajes());
		}

		for (String b : personajes) {
			  
			String d = b;
			personajeResponse.setCharacter(d);
			  
			  for (Personajes c : lsPersonajes) {
				  
				  if(c.getPersonajes().equals(d)) {
					  comics.add(c.getComic());
				  }
				
			  }
			  personajeResponse.setComics(comics);
		}
		personajeResponse.setLast_sync(Utilerias.formatFechaSincronizacion(lsPersonajes.get(0).getSincronizacion()));
		
		
		
		

		return personajeResponse;
	}

}
