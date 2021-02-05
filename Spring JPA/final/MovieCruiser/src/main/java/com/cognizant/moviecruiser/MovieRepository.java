package com.cognizant.movieCruiser;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.movieCruiser.model.Movie;



public interface MovieRepository extends JpaRepository<Movie,Integer> {

	@Query(value="select * from movies where movie_active=true and date_of_launch<=CURDATE()", nativeQuery=true)
	public List<Movie> findByActiveandDateOfLaunch();
	
	}