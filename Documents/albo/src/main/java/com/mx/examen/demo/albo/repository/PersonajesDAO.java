package com.mx.examen.demo.albo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.examen.demo.albo.entity.Personajes;

@Repository
public interface PersonajesDAO extends CrudRepository<Personajes, Integer> {
	
	
	List<Personajes> findByHeroe(String heroe);
	

}
