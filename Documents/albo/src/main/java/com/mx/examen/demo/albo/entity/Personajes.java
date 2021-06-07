package com.mx.examen.demo.albo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Personajes")
public class Personajes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersonajes;

	private String comic;
	private String personajes;
	private Date sincronizacion;
	private String heroe;
	
	
	public String getHeroe() {
		return heroe;
	}
	
	public void setHeroe(String heroe) {
		this.heroe = heroe;
	}
	

	public Date getSincronizacion() {
		return sincronizacion;
	}

	public void setSincronizacion(Date sincronizacion) {
		this.sincronizacion = sincronizacion;
	}

	public Integer getIdPersonajes() {
		return idPersonajes;
	}

	public void setIdPersonajes(Integer idPersonajes) {
		this.idPersonajes = idPersonajes;
	}

	public String getComic() {
		return comic;
	}

	public void setComic(String comic) {
		this.comic = comic;
	}

	public String getPersonajes() {
		return personajes;
	}

	public void setPersonajes(String personajes) {
		this.personajes = personajes;
	}

}
