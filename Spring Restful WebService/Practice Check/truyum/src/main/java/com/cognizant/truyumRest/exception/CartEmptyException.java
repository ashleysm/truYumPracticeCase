package com.cognizant.truyumRest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND , reason="Cart Is Empty")
public class CartEmptyException extends Exception {

}
