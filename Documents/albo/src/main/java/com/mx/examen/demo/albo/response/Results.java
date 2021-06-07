package com.mx.examen.demo.albo.response;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Results {

	private Integer id;
	private String name;
	private String description;
	private Date modified;
	private String resourceURI;
	private List<Urls> urls;
	private Thumbnail thumbnail;
	
	private Comics comics;
	private Series series;
	private Stories stories;
	private Events events;
	

	public Date getModified() {
		return modified;
	}
	
	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public Comics getComics() {
		return comics;
	}

	public void setComics(Comics comics) {
		this.comics = comics;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public Stories getStories() {
		return stories;
	}

	public void setStories(Stories stories) {
		this.stories = stories;
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public List<Urls> getUrls() {

		if (urls == null) {
			urls = new ArrayList<Urls>();
		}
		return urls;
	}

	public void setUrls(List<Urls> urls) {
		this.urls = urls;
	}

}
