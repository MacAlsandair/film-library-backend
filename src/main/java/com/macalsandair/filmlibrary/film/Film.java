package com.macalsandair.filmlibrary.film;

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
@Getter
@Setter
@NoArgsConstructor
public class Film {
	
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
	
	
	
}
