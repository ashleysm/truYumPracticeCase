package com.cognizant.movieCruiser;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.movieCruiser.model.Favorites;

public interface FavRepository extends JpaRepository<Favorites, Map<Integer, Integer>>{

}