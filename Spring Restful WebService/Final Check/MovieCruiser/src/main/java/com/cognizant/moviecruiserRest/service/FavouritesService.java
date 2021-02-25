package com.cognizant.moviecruiserRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiserRest.dao.FavoritesDao;
import com.cognizant.moviecruiserRest.exception.FavoritesEmptyException;
import com.cognizant.moviecruiserRest.model.Favorites;

@Service
public class FavoritesService {

	@Autowired
	private FavoritesDao favDao;
	
	public void addToFavorites(int userId, int movieId) {
		favDao.addToFavorites(userId, movieId);
	}
	public Favorites getAllFavorites(int userId) throws FavoritesEmptyException {
		return favDao.getAllFavorites(userId);
	}
	public void removeFavMovie(int userId, int movieId) throws FavoritesEmptyException{
		favDao.removeFavMovie(userId, movieId);
	}
}