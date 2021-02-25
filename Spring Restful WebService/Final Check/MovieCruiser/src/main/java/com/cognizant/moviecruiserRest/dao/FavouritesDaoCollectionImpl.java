package com.cognizant.moviecruiserRest.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.moviecruiserRest.exception.FavoritesEmptyException;
import com.cognizant.moviecruiserRest.model.Favorites;
import com.cognizant.moviecruiserRest.model.Movie;


@Component
public class FavoritesDaoCollectionImpl implements FavoritesDao {

	private LinkedHashMap<Integer,Favorites> userFavList;
	
	@Autowired
	private MovieDao movieDao;
	
	public MovieDao getMovieDao() {
		return movieDao;
	}

	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	public FavoritesDaoCollectionImpl() {
		this.userFavList=new LinkedHashMap<>();
	}

	public LinkedHashMap<Integer, Favorites> getUserFavList() {
		return userFavList;
	}

	public void setUserFavList(LinkedHashMap<Integer, Favorites> userFavList) {
		this.userFavList = userFavList;
	}



	@Override
	public void addToFavorites(int userId, int movieId) {
		Movie movie=movieDao.getMovie(movieId);
		if(userFavList.containsKey(userId)) {
			Favorites fav=userFavList.get(userId);
			List<Movie> favMovies=fav.getFavoriteList();
			favMovies.add(movie);
			fav.setFavoriteList(favMovies);
			userFavList.put(userId, fav);
		}
		else {
			Favorites fav = new Favorites(new ArrayList<Movie>(), 0);
			List<Movie> favMovies = fav.getFavoriteList();
			favMovies.add(movie);
			fav.setFavoriteList(favMovies);
			userFavList.put(userId, fav);
		}	
		
	}

	@Override
	public Favorites getAllFavorites(int userId) throws FavoritesEmptyException {
		Favorites fav= userFavList.get(userId);
		
		if(fav==null) {
			throw new FavoritesEmptyException();
		}
		
		List<Movie> movieList = fav.getFavoriteList();
		
		if (movieList == null || movieList.size() < 1)
			throw new FavoritesEmptyException();
		else {
			int total = 0;
			for (Movie movie : movieList) {
				total++;
			}
			fav.setTotal(total);
		}
		
		return fav;
	}

	
	@Override
	public void removeFavMovie(int userId, int movieId) throws FavoritesEmptyException {
		Favorites fav= userFavList.get(userId);
		
		if(fav==null) {
			throw new FavoritesEmptyException();
		}
		
		List<Movie> movieList = fav.getFavoriteList();
		
		if (movieList == null || movieList.size() < 1)
			throw new FavoritesEmptyException();
		
			for(Movie movie:movieList) {
				if(movie.getid()==movieId) {
					movieList.remove(movie);
					break;
				}
			}
			fav.setFavoriteList(movieList);
			userFavList.put(userId, fav);
		
	}
	
}