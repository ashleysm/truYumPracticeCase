package com.cognizant.moviecruiserRest.model;

import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class Movie {

	private int id;
	private String movieTitle;
	private double boxOffice;
	private String genre;
	private boolean teaser;	
	private boolean active;	
	private Date dateOfLaunch;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public double getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isTeaser() {
		return teaser;
	}
	public void setTeaser(boolean teaser) {
		this.teaser = teaser;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieTitle=" + movieTitle + ", boxOffice=" + boxOffice + "cr , genre="
				+ genre + ", teaser=" + teaser + ", active=" + active + ", dateOfLaunch=" + dateOfLaunch + "]";
	}
	public Movie(int id, String movieTitle, double boxOffice, String genre, boolean teaser, boolean active,
			Date dateOfLaunch) {
		super();
		this.id = id;
		this.movieTitle = movieTitle;
		this.boxOffice = boxOffice;
		this.genre = genre;
		this.teaser = teaser;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
	}

	public Movie() {
		
	}
	@Override
	public boolean equals(Object obj) {
		Movie other = (Movie) obj;
		return id == other.id;
	}
}