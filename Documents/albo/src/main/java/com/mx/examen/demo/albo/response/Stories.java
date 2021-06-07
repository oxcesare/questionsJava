package com.mx.examen.demo.albo.response;

import java.util.ArrayList;
import java.util.List;

public class Stories {

	private Integer available;
	private String collectionURI;
	private List<Items> items;
	private Integer returned;

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}

	public List<Items> getItems() {

		if (items == null) {
			items = new ArrayList<Items>();
		}
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Integer getReturned() {
		return returned;
	}

	public void setReturned(Integer returned) {
		this.returned = returned;
	}

}
