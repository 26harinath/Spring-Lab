package org.capg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {
	@Id
	private String name;
	private double rating;
	private String genre;
	public Movies() {
		
	}
	public Movies(String name, double rating, String genre) {
		super();
		this.name = name;
		this.rating = rating;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
