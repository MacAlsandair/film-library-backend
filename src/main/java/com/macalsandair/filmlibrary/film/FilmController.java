package com.macalsandair.filmlibrary.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/film")
public class FilmController {

	@Autowired
	FilmRepository filmRepository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Film>> getAllFilms() {
		return new ResponseEntity<> (filmRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Film> addNewFilm (String name, String director, String shortDescription, int rating, String countryOfOrigin, String genre,
			String[] actors, String filmCompany, Long budget, int yearOfRelease) {
		Film newFilm = new Film (name, director, shortDescription, rating, countryOfOrigin, genre,
			actors, filmCompany, budget, yearOfRelease);
		filmRepository.save(newFilm);
		return new ResponseEntity<> (newFilm, HttpStatus.OK);
	}
	
}
