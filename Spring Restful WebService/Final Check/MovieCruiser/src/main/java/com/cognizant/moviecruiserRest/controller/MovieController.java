package com.cognizant.moviecruiserRest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.moviecruiserRest.MoviecruiserRestApplication;
import com.cognizant.moviecruiserRest.model.Movie;
import com.cognizant.moviecruiserRest.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieService mvService;
	
	private static Logger log= LoggerFactory.getLogger(MoviecruiserRestApplication.class);
	
	@GetMapping
	public List<Movie> getMovieListAdmin(){
		log.info("Start get movie list admin");
		return mvService.getMovieListAdmin();
	}
	@GetMapping("/customer")
	public List<Movie> getMovieListCustomer(){
		log.info("Start get movie list customer");
		return mvService.getMovieListCustomer();
	}
	
	@GetMapping("/{id}")
	public Movie getMovie(@PathVariable int id) {
		log.info("Start get movie by id");
		return mvService.getMovie(id);
	}
	
	@PutMapping
	public void editMovie(@RequestBody Movie movie) {
		log.info("Start editing movie");
		mvService.editMovie(movie);
		
	}

}
