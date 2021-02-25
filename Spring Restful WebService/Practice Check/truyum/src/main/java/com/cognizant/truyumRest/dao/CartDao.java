package com.cognizant.truyumRest.dao;

import org.springframework.stereotype.Component;

import com.cognizant.truyumRest.exception.CartEmptyException;
import com.cognizant.truyumRest.model.Cart;

@Component
public interface CartDao {

	void addCartItem(long userId, long menuItemId);
	Cart getAllCartItems(long userId) throws CartEmptyException;	
	void removeCartItem(long userId, long menuItemId) throws CartEmptyException;

}