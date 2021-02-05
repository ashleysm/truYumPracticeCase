package com.cognizant.truyum;


import java.text.ParseException;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;
import com.cognizant.truyum.util.DateUtil;


@SpringBootApplication
public class TruyumApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TruyumApplication.class);
	private static MenuItemService menuItemService ;

	public static void main(String[] args) throws ParseException {
		LOGGER.info("Inside main");
		ApplicationContext context = SpringApplication.run(TruyumApplication.class, args);
		menuItemService = context.getBean(MenuItemService.class);
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testGetMenuItem();
		testEditMenuItem();
		
	}
	
	private static void testGetMenuItemListAdmin() {
		LOGGER.info("***** start menu item list Admin ****");
		List<MenuItem> items=menuItemService.getMenuItemListAdmin();
		LOGGER.debug("Menu Items = {}", items);
		LOGGER.info("*****end menu item list Admin*****");
	}
	
	private static void testGetMenuItemListCustomer() {
		LOGGER.info("***** start menu item list Customer ****");
		Set<MenuItem> items=menuItemService.getMenuItemListCustomer();
		LOGGER.debug("Menu Items = {}", items);
		LOGGER.info("***** end menu item list Customer *****");
	}
	
	private static void testGetMenuItem() {
		LOGGER.info("**** start get menu item *****");
		MenuItem menu_item=menuItemService.getMenuItem(1);
		LOGGER.debug("Menu item = {}",menu_item);
		LOGGER.info("**** end get menu item ****");
	}
	
	private static void testEditMenuItem() throws ParseException {
		LOGGER.info("**** start edit menu item ****");
		MenuItem newMenuItem = new MenuItem(1, "Big Sandwhich", (float) 100.0, true, DateUtil.convertToDate("20/03/2017"),
				"Main Course", true);
		menuItemService.editMenuItem(newMenuItem);
		MenuItem modifiedItem=menuItemService.getMenuItem(1);
		LOGGER.debug("Modified menu Item ={}",modifiedItem);
		LOGGER.info("**** end edit menu item ****");
	}

}
