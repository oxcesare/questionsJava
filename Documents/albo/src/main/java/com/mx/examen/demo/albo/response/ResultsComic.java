package com.mx.examen.demo.albo.response;

import java.util.List;

public class ResultsComic {

	private Integer id;
	private Integer digitalId;
	private String title;
	private double issueNumber;
	private String variantDescription;
	private String description;

	private String isbn;
	private String upc;
	private String diamondCode;
	private String ean;
	private String issn;
	private String format;
	private Integer pageCount;
	private List<?> textObjects;
	private String resourceURI;
	private List<Urls> urls;
	private SeriesResponse series;
	private List<?> variants;
	private List<?> collections;
	private List<?> collectedIssues;
	//private List<Dates> dates;
	private List<Prices> prices;
	private Thumbnail thumbnail;
	private List<?> images;
	private Creators creators;
	private Characters characters;
	private Stories stories;
	private Events events;

	public void setIssueNumber(double issueNumber) {
		this.issueNumber = issueNumber;
	}

	public double getIssueNumber() {
		return issueNumber;
	}

	public Creators getCreators() {
		return creators;
	}

	public void setCreators(Creators creators) {
		this.creators = creators;
	}

	public Characters getCharacters() {
		return characters;
	}

	public void setCharacters(Characters characters) {
		this.characters = characters;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDigitalId() {
		return digitalId;
	}

	public void setDigitalId(Integer digitalId) {
		this.digitalId = digitalId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVariantDescription() {
		return variantDescription;
	}

	public void setVariantDescription(String variantDescription) {
		this.variantDescription = variantDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getDiamondCode() {
		return diamondCode;
	}

	public void setDiamondCode(String diamondCode) {
		this.diamondCode = diamondCode;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public List<?> getTextObjects() {
		return textObjects;
	}

	public void setTextObjects(List<?> textObjects) {
		this.textObjects = textObjects;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public List<Urls> getUrls() {
		return urls;
	}

	public void setUrls(List<Urls> urls) {
		this.urls = urls;
	}

	public SeriesResponse getSeries() {
		return series;
	}

	public void setSeries(SeriesResponse series) {
		this.series = series;
	}

	public List<?> getVariants() {
		return variants;
	}

	public void setVariants(List<?> variants) {
		this.variants = variants;
	}

	public List<?> getCollections() {
		return collections;
	}

	public void setCollections(List<?> collections) {
		this.collections = collections;
	}

	public List<?> getCollectedIssues() {
		return collectedIssues;
	}

	public void setCollectedIssues(List<?> collectedIssues) {
		this.collectedIssues = collectedIssues;
	}



	public List<Prices> getPrices() {
		return prices;
	}

	public void setPrices(List<Prices> prices) {
		this.prices = prices;
	}

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<?> getImages() {
		return images;
	}

	public void setImages(List<?> images) {
		this.images = images;
	}

}