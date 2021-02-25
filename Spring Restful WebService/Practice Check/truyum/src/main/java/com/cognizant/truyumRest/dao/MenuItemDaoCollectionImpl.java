package com.cognizant.truyumRest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.truyumRest.model.MenuItem;

@Component
public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private List<MenuItem> menuItemList;
	
	public MenuItemDaoCollectionImpl() {
		ApplicationContext context= new ClassPathXmlApplicationContext("truyum.xml");
		menuItemList=(List<MenuItem>)context.getBean("menuItemList");
	}
	
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> cusMenuItemList= new ArrayList<>();
		for(MenuItem item:menuItemList) {
			if(item.isActive()&& (item.getDateOfLaunch().equals(new Date())|| item.getDateOfLaunch().before(new Date()))) {
				cusMenuItemList.add(item);
			}
		}
		return cusMenuItemList;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		for(MenuItem item:menuItemList) {
			if(item.getId()==menuItem.getId())
			{
				menuItemList.remove(item);
				menuItemList.add(menuItem);
				break;
			}
		}
		
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		for(MenuItem item:menuItemList) {
			if(item.getId()==menuItemId) {
				return item;
			}
		}
		return null;
		
	}

}