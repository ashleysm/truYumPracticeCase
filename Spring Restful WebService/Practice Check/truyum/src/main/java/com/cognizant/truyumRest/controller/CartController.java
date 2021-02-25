package com.cognizant.truyumRest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyumRest.TruyumRestApplication;
import com.cognizant.truyumRest.exception.CartEmptyException;
import com.cognizant.truyumRest.model.Cart;
import com.cognizant.truyumRest.service.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {
	@Autowired
	private CartService cartService;
	private static Logger log= LoggerFactory.getLogger(TruyumRestApplication.class);
	
	@PostMapping("/{userId}/{menuItemId}")
	public void addCartItem(@PathVariable long userId,@PathVariable long menuItemId) {
		log.info("Start add to cart ");
		cartService.addCartItem(userId, menuItemId);
	}
	
	@GetMapping("/{userId}")
	public Cart getAllCartItems(@PathVariable long userId) throws CartEmptyException{
		log.info("Start get all cart item ");
		return cartService.getAllCartItems(userId);
	}
	
	@DeleteMapping("/{userId}/{menuItemId}")
	public void removeCartItem(@PathVariable long userId, @PathVariable long menuItemId) throws CartEmptyException {
		log.info("Start remove from cart");
		cartService.removeCartItem(userId,menuItemId);
	}
	

}