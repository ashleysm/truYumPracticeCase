package com.cognizant.moviecruiserRest.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Favorites {

	private List<Movie> favoriteList;
	private int total;
	public List<Movie> getFavoriteList() {
		return favoriteList;
	}
	public void setFavoriteList(List<Movie> favoriteList) {
		this.favoriteList = favoriteList;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public Favorites(List<Movie> favoriteList, int total) {
		super();
		this.favoriteList = favoriteList;
		this.total = total;
	}
	public Favorites() {
		
	}
	
}
