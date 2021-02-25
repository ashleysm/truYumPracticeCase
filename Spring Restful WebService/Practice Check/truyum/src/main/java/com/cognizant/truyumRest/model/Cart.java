package com.cognizant.truyumRest.model;

import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class Cart {
    private List<MenuItem> menuItemlist;
    private double total;

    public List<MenuItem> getMenuItemList()
    {
		return this.menuItemlist;
    }

    public void setMenuItemList(List<MenuItem> menu) {
        this.menuItemlist = menu;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public Cart(List<MenuItem> menu, double total) {
        menuItemlist = menu;
        this.total = total;
    }
    public Cart() {
    	
    }
}
