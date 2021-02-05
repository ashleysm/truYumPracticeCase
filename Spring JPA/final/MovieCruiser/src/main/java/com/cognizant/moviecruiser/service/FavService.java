package com.cognizant.movieCruiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.movieCruiser.FavRepository;



@Service
public class FavService {
		
		@Autowired
		private FavRepository favRepository;

}