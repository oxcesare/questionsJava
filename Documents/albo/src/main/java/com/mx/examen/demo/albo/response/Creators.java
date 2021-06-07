package com.mx.examen.demo.albo.response;

import java.util.List;

public class Creators {

	
	private int available;
	private String collectionURI;
	private List<ItemsCreators> items;
	private int returned;
	
	
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
	public List<ItemsCreators> getItems() {
		return items;
	}
	public void setItems(List<ItemsCreators> items) {
		this.items = items;
	}
	public Integer getReturned() {
		return returned;
	}
	public void setReturned(Integer returned) {
		this.returned = returned;
	}
	
	
	
	
}


