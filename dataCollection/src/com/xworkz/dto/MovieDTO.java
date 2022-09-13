package com.xworkz.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable{
	
	  private String name;
	  private String language;
	  private String producer;
	  private String director;
	  private String scriptWritter;
	  private String editor;
	  private String cameraMan;
	  private String musicDirector;
	  private double budget;
	  private double boxOffice;
	  private String heroName;
	  private String heroinName;
	  private double rating;
	  private double ticketPrice;
	  
	  public MovieDTO() {
		System.out.println("default constructor");
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", language=" + language + ", producer=" + producer + ", director=" + director
				+ ", scriptWritter=" + scriptWritter + ", editor=" + editor + ", cameraMan=" + cameraMan
				+ ", musicDirector=" + musicDirector + ", budget=" + budget + ", boxOffice=" + boxOffice + ", heroName="
				+ heroName + ", heroinName=" + heroinName + ", rating=" + rating + ", ticketPrice=" + ticketPrice + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getScriptWritter() {
		return scriptWritter;
	}

	public void setScriptWritter(String scriptWritter) {
		this.scriptWritter = scriptWritter;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getCameraMan() {
		return cameraMan;
	}

	public void setCameraMan(String cameraMan) {
		this.cameraMan = cameraMan;
	}

	public String getMusicDirector() {
		return musicDirector;
	}

	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroinName() {
		return heroinName;
	}

	public void setHeroinName(String heroinName) {
		this.heroinName = heroinName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	  
	  
	  
	  
	  

}
