package com.cognizant.moviecruiserRest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.moviecruiserRest.model.Movie;

@Component
public class MovieDaoCollectionImpl implements MovieDao{

	private List<Movie> movieList;
	
	public MovieDaoCollectionImpl()
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("moviecruiser.xml");
		movieList=(List<Movie>) context.getBean("movieList");
	}

	@Override
	public List<Movie> getMovieListAdmin() {
		return movieList;
	}

	@Override
	public List<Movie> getMovieListCustomer() {
		List<Movie> cusMovieList=new ArrayList<>();
		for(Movie movie: movieList) {
			if(movie.isActive() && (movie.getDateOfLaunch().equals(new Date()) || movie.getDateOfLaunch().before(new Date()) )) {
				cusMovieList.add(movie);
			}
		}
		return cusMovieList;
		}

	@Override
	public Movie getMovie(int id) {
		for(Movie movie:movieList) {
			if(movie.getid()==id) {
				return movie;
			}
		}
		return null;
	}

	@Override
	public void editMovie(Movie movie) {
		for(Movie movieinList:movieList) {
			if(movieinList.getid()==movie.getid()) {
				movieList.remove(movieinList);
				movieList.add(movie);
				break;
			}
		}
		
	}
	
}
