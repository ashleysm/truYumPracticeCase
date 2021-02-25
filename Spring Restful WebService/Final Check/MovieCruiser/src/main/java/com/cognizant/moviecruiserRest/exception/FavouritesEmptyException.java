package com.cognizant.moviecruiserRest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND,reason="Favorites is empty")
public class FavoritesEmptyException extends Exception{

}
