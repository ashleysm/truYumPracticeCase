package com.cognizant.truyumRest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyumRest.TruyumRestApplication;
import com.cognizant.truyumRest.model.MenuItem;
import com.cognizant.truyumRest.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {
	
	@Autowired
	private MenuItemService menuItemService;
	
	private static Logger log= LoggerFactory.getLogger(TruyumRestApplication.class);
	
	@GetMapping
	public List<MenuItem> getAllMenuItems(){
		log.info("Start get all menu Items");
		return menuItemService.getMenuItemListCustomer();
	}
	
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable long id) {
		log.info("Start get menu item");
		return menuItemService.getMenuItem(id);
	}
	
	@PutMapping()
	public void modifyMenuItem(@RequestBody MenuItem item ) {
		log.info("Start modify menu item");
		menuItemService.modifyMenuItem(item);
	}
	

}