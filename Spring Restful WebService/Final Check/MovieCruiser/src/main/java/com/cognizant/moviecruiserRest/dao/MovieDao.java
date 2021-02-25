package com.cognizant.moviecruiserRest.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.moviecruiserRest.model.Movie;

@Component
public interface MovieDao {

	public List<Movie> getMovieListAdmin();
	public List<Movie> getMovieListCustomer();
	public Movie getMovie(int id) ;
	public void editMovie(Movie movie);
}
