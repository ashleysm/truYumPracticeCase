package com.cognizant.truyumRest.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.truyumRest.exception.CartEmptyException;
import com.cognizant.truyumRest.model.Cart;
import com.cognizant.truyumRest.model.MenuItem;

@Component
public class CartDaoCollectionImpl implements CartDao {

	private LinkedHashMap<Long, Cart> userCart;

	@Autowired
	private MenuItemDao menuItemDao;
	
	public CartDaoCollectionImpl() {
	this.userCart=new LinkedHashMap<>();
		
	}
	
	public MenuItemDao getMenuItemDao() {
		return menuItemDao;
	}

	public void setMenuItemDao(MenuItemDao menuItemDao) {
		this.menuItemDao = menuItemDao;
	}

	public LinkedHashMap<Long, Cart> getUserCart() {
		return userCart;
	}

	public void setUserCart(LinkedHashMap<Long, Cart> userCart) {
		this.userCart= userCart;
	}

	@Override
	public void addCartItem(long userId, long menuItemId) {
		
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
		
		if (userCart.containsKey(userId)) {
			Cart cart = userCart.get(userId);
			List<MenuItem> newList = cart.getMenuItemList();
			newList.add(menuItem);
			cart.setMenuItemList(newList);
			userCart.put(userId, cart);
		} 
		else {
			Cart cart = new Cart(new ArrayList<MenuItem>(), 0);
			List<MenuItem> newList = cart.getMenuItemList();
			newList.add(menuItem);
			cart.setMenuItemList(newList);
			userCart.put(userId, cart);
		}

	}

	@Override
	public Cart getAllCartItems(long userId) throws CartEmptyException {
		
		Cart cart = userCart.get(userId);
		
		if(cart==null) {
			throw new CartEmptyException();
		}
		
		List<MenuItem> itemList = cart.getMenuItemList();
		
		if (itemList == null || itemList.size() < 1)
			throw new CartEmptyException();
		else {
			double total = 0;
			for (MenuItem menuItem : itemList) {
				total += menuItem.getPrice();
			}
			cart.setTotal(total);
		}
		
		return cart;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) throws CartEmptyException {
		
		Cart cart = userCart.get(userId);
		if(cart==null) {
			throw new CartEmptyException();
		}
		
		List<MenuItem> itemList = cart.getMenuItemList();
		
		if (itemList == null || itemList.size() < 1)
			throw new CartEmptyException();
		
		for (MenuItem menuItem : itemList) {
			if (menuItem.getId() == menuItemId) {
				itemList.remove(menuItem);
				break;
			}
		}
			cart.setMenuItemList(itemList);
			userCart.put(userId, cart);
		
	}

}