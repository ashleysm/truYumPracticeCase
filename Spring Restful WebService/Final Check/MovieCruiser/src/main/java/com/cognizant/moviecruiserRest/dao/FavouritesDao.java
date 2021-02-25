package com.cognizant.moviecruiserRest.dao;

import org.springframework.stereotype.Component;

import com.cognizant.moviecruiserRest.exception.FavoritesEmptyException;
import com.cognizant.moviecruiserRest.model.Favorites;



@Component
public interface FavoritesDao {

	void addToFavorites(int userId, int movieId);
	Favorites getAllFavorites(int userId) throws FavoritesEmptyException;	
	void removeFavMovie(int userId, int movieId) throws FavoritesEmptyException;

}
