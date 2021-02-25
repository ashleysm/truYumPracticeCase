package com.cognizant.moviecruiserRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiserRest.dao.MovieDao;
import com.cognizant.moviecruiserRest.model.Movie;

@Service
public class MovieService {

	@Autowired
	private MovieDao movieDao;
	
	public List<Movie> getMovieListAdmin(){
		return movieDao.getMovieListAdmin();
	}
	
	public List<Movie> getMovieListCustomer(){
		return movieDao.getMovieListCustomer();
	}
	
	public Movie getMovie(int id)
	{
		return movieDao.getMovie(id);
	}
	
	public void editMovie(Movie movie) {
		movieDao.editMovie(movie);
	}
	
}