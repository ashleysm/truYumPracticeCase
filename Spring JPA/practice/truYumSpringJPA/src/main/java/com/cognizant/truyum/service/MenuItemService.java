package com.cognizant.truyum.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.MenuItemRepository;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemService  {

	@Autowired
	MenuItemRepository menuItemRepository;
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin(){
	
		return menuItemRepository.findAll();
	}
	
	@Transactional
	public Set<MenuItem> getMenuItemListCustomer(){
		return menuItemRepository.findByItemActiveandDateOfLaunch();
	}
	
	@Transactional
	public MenuItem getMenuItem(int id) {
		Optional<MenuItem> itemList= menuItemRepository.findById(id);
		MenuItem item=itemList.get();
		return item;
	}
	
	@Transactional
	public void editMenuItem(MenuItem item) {
		menuItemRepository.save(item);
	}
}
