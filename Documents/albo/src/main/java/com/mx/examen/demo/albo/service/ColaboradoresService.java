package com.mx.examen.demo.albo.service;

import com.mx.examen.demo.albo.entity.Colaboradores;
import com.mx.examen.demo.albo.response.ColaboradoresResponse;

public interface ColaboradoresService {
	
	public void save(Colaboradores comic);
	
	ColaboradoresResponse findByName(String name);

}
