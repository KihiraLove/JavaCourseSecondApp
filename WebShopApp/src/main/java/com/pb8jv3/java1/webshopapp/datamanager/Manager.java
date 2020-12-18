package com.pb8jv3.java1.webshopapp.datamanager;

import com.pb8jv3.java1.webshopapp.datamanager.data.Monitor;
import java.util.Map;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class Manager {
    
    Map<Integer, Monitor> products;

    public Manager(Map<Integer, Monitor> products) {
	this.products = products;
    }

    public Map<Integer, Monitor> getProducts() {
	return products;
    }

    public void setProducts(Map<Integer, Monitor> products) {
	this.products = products;
    }
    
    
}
