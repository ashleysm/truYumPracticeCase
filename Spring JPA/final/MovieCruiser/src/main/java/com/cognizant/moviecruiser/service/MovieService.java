package com.cognizant.movieCruiser.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.movieCruiser.MovieRepository;
import com.cognizant.movieCruiser.model.Movie;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	@Transactional
	public List<Movie> getMovieListAdmin(){
		return movieRepository.findAll();
	}
	
	@Transactional
	public List<Movie> getMovieListCustomer(){
		return movieRepository.findByActiveandDateOfLaunch();
	}
	
	@Transactional
	public Movie getMovie(int id) {
		Optional<Movie> movieRetrieved=movieRepository.findById(id);
		Movie movie1=movieRetrieved.get();
		return movie1;
	}
	
	@Transactional
	public void editMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	
	
	
}