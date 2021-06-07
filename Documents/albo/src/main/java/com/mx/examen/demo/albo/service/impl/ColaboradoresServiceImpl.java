package com.mx.examen.demo.albo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.examen.demo.albo.entity.Colaboradores;
import com.mx.examen.demo.albo.repository.ColaboradoresDAO;
import com.mx.examen.demo.albo.response.ColaboradoresResponse;
import com.mx.examen.demo.albo.service.ColaboradoresService;
import com.mx.examen.demo.albo.util.Utilerias;

@Service
public class ColaboradoresServiceImpl implements ColaboradoresService {

	@Autowired
	private ColaboradoresDAO personajeCreadoresDAO;

	@Override
	public void save(Colaboradores comic) {
		personajeCreadoresDAO.save(comic);
	}

	@Override
	public ColaboradoresResponse findByName(String name) {
		
		List<String> editors = new ArrayList<>();
		List<String> writers = new ArrayList<>();
		List<String> colorists = new ArrayList<>();

		List<Colaboradores> lsColaboradores = personajeCreadoresDAO.findByPersonaje(name);
		
		ColaboradoresResponse colaboradores = new ColaboradoresResponse();
		
		
		for (Colaboradores colaboradoresResponse : lsColaboradores) {
			  
			      if(colaboradoresResponse.getRol().equals(Utilerias.EDITOR)) {
			    	  editors.add(colaboradoresResponse.getName());
			      }
			      
			      if(colaboradoresResponse.getRol().equals(Utilerias.WRITER)) {
			    	  writers.add(colaboradoresResponse.getName());
			      }
			      
			      if(colaboradoresResponse.getRol().equals(Utilerias.COLORIST)) {
			    	  colorists.add(colaboradoresResponse.getName());
			      }
		}
		
		colaboradores.setLast_sync(Utilerias.formatFechaSincronizacion(lsColaboradores.get(0).getSincronizacion()));
		colaboradores.setColorists(colorists);
		colaboradores.setEditors(editors);
		colaboradores.setWriters(writers);
		
		return colaboradores;
	}


}
