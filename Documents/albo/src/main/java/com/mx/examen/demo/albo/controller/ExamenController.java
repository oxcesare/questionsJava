package com.mx.examen.demo.albo.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mx.examen.demo.albo.entity.Colaboradores;
import com.mx.examen.demo.albo.entity.Personajes;
import com.mx.examen.demo.albo.excepion.CharacterException;
import com.mx.examen.demo.albo.response.ColaboradoresResponse;
import com.mx.examen.demo.albo.response.DemoCharacterResponse;
import com.mx.examen.demo.albo.response.DemoComicResponse;
import com.mx.examen.demo.albo.response.Items;
import com.mx.examen.demo.albo.response.ItemsCreators;
import com.mx.examen.demo.albo.response.PersonajesResponse;
import com.mx.examen.demo.albo.response.ResultsComic;
import com.mx.examen.demo.albo.response.SincronizacionResponse;
import com.mx.examen.demo.albo.service.impl.ColaboradoresServiceImpl;
import com.mx.examen.demo.albo.service.impl.PersonajesServiceImpl;
import com.mx.examen.demo.albo.util.Utilerias;

@RestController
public class ExamenController {

	private static final Logger logger = LoggerFactory.getLogger(ExamenController.class);

	@Value("${config.ts}")
	private int ts;

	@Value("${config.apikey}")
	private String apikey;

	@Value("${config.hash}")
	private String hash;

	@Autowired
	private ColaboradoresServiceImpl colaboradoresServiceImpl;

	@Autowired
	private PersonajesServiceImpl personajesServiceImpl;

	RestTemplate restTemplate = null;

	public ExamenController() {
		restTemplate = new RestTemplate();
	}

	@GetMapping("/info")
	public String hello() {
		return "Examen Albo -  07 Junio 2021"
				+ "Autor: César Ricardo Alducin Ruiz";
	}

	/**
	 * 
	 * @param name
	 * @throws CharacterException
	 */
	@GetMapping("/synchronization/{name}")
	public ResponseEntity<SincronizacionResponse> getCharacter(@PathVariable String name) throws CharacterException {

		String url = "https://gateway.marvel.com/v1/public/characters?ts=" + ts + "&apikey=" + apikey + "&hash=" + hash
				+ "&name=" + name;

		DemoCharacterResponse   character = new DemoCharacterResponse();
		SincronizacionResponse  response  = new SincronizacionResponse();

		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

		try {

			character = restTemplate.getForObject(url, DemoCharacterResponse.class);

			int id = character.getData().getResults().get(0).getId();
			String CharacterName = character.getData().getResults().get(0).getName();

			if (id != 0) {
				getComicByCharacter(id, CharacterName);
				response.setMensaje("Sincronizacion Exitosa");
				
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			response.setMensaje("Sincronizacion No Exitosa");
			throw new CharacterException("CHARACTER NOT EXIST");
			
		}

		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}

	/**
	 * 
	 * @param id
	 * @param CharacterName
	 * @throws CharacterException
	 */
	private void getComicByCharacter(int id, String CharacterName) throws CharacterException {

		String url = "https://gateway.marvel.com:443/v1/public/comics?ts=" + ts + "&apikey=" + apikey + "&hash=" + hash
				+ "&characters=" + id;

		DemoComicResponse comic = new DemoComicResponse();

		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

		try {

			comic = restTemplate.getForObject(url, DemoComicResponse.class);

			List<ResultsComic> results = findCreators(CharacterName, comic);

			createCharacters(CharacterName, results);

		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}

	private void createCharacters(String CharacterName, List<ResultsComic> results) {
		// Characters
		Personajes personajes = null;

		for (ResultsComic resultsComic : results) {

			for (Items creators : resultsComic.getCharacters().getItems()) {

				personajes = new Personajes();
				personajes.setComic(resultsComic.getTitle());
				personajes.setPersonajes(creators.getName());
				personajes.setSincronizacion(new Date());
				personajes.setHeroe(CharacterName);
				personajesServiceImpl.save(personajes);
			}
		}
	}

	private List<ResultsComic> findCreators(String CharacterName, DemoComicResponse comic) {
		Colaboradores comicSave;
		List<ResultsComic> results = comic.getData().getResults();

		// Creators
		for (ResultsComic resultsComic : results) {

			for (ItemsCreators creators : resultsComic.getCreators().getItems()) {

				if (creators.getRole().equals(Utilerias.EDITOR) || creators.getRole().equals(Utilerias.WRITER)
						|| creators.getRole().equals(Utilerias.COLORIST)) {
					System.out.println(creators.getName());
					System.out.println(creators.getRole());
					comicSave = new Colaboradores();
					comicSave.setPersonaje(CharacterName);
					comicSave.setRol(creators.getRole());
					comicSave.setName(creators.getName());
					comicSave.setSincronizacion(new Date());
					colaboradoresServiceImpl.save(comicSave);

				}

			}

		}
		return results;
	}

	
	/**
	 * 
	 * @param character
	 * @return
	 */
	@GetMapping("/colaboradores/{character}")
	public ResponseEntity<ColaboradoresResponse> getColaborador(@PathVariable String character) {

		ColaboradoresResponse colaboradores = new ColaboradoresResponse();

		try {
			colaboradores = colaboradoresServiceImpl.findByName(character);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(colaboradores);
	}

	/**
	 * 
	 * @param character
	 * @return
	 */
	@GetMapping("/personajes/{character}")
	public ResponseEntity<PersonajesResponse> getPersonajes(@PathVariable String character) {

		PersonajesResponse personaje = new PersonajesResponse();

		try {
			personaje = personajesServiceImpl.listHeroe(character);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		return ResponseEntity.status(HttpStatus.OK).body(personaje);

	}

}
