package com.macalsandair.filmlibrary.film;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Film")
@Table(name = "film")
public class Film implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private String director;
	private String shortDescription;
	private int rating;
	private String countryOfOrigin;
	private String genre;
	private String[] actors;
	private String filmCompany;
	private Long budget;
	private int yearOfRelease;
	
	public Film(String name, String director, String shortDescription, int rating, String countryOfOrigin, String genre,
			String[] actors, String filmCompany, Long budget, int yearOfRelease) {
		super();
		this.name = name;
		this.director = director;
		this.shortDescription = shortDescription;
		this.rating = rating;
		this.countryOfOrigin = countryOfOrigin;
		this.genre = genre;
		this.actors = actors;
		this.filmCompany = filmCompany;
		this.budget = budget;
		this.yearOfRelease = yearOfRelease;
	}

	public Film() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public String getFilmCompany() {
		return filmCompany;
	}

	public void setFilmCompany(String filmCompany) {
		this.filmCompany = filmCompany;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	
	
	
}
