package com.cognizant.movieCruiser.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {

	@Id
	@Column(name="id")
	private int movieId;
	
	@Column(name="title")
	private String movieTitle;
	
	@Column(name="box_office")
	private double boxOffice;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="teaser")
	private boolean teaser;
	
	@Column(name="movie_active")
	private boolean active;
	
	@Column(name="date_of_launch")
	private Date dateOfLaunch;
	
	//@ManyToOne


	public Movie() {
		
	}
	
	public Movie(int movieId, String movieTitle,double boxOffice, String genre, boolean teaser, boolean active,
			Date dateOfLaunch) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.boxOffice = boxOffice;
		this.genre = genre;
		this.teaser = teaser;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", boxOffice=" + boxOffice + " crore, genre="
				+ genre + ", teaser=" + teaser + ", active=" + active + ", dateOfLaunch=" + dateOfLaunch + "]";
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
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


}