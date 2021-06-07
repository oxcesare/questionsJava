package com.mx.examen.demo.albo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mx.examen.demo.albo.entity.Colaboradores;

@Repository
@Transactional
public interface ColaboradoresDAO extends CrudRepository<Colaboradores, Integer> {
	
	
	List<Colaboradores> findByName(String name);
	
	List<Colaboradores> findByPersonaje(String personaje);
	
	
	

}
