package com.pb8jv3.java1.webshopapp.datamanager;

import com.pb8jv3.java1.webshopapp.datamanager.data.Monitor;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class ProductManager extends Manager {

    public ProductManager(Map<Integer, Monitor> products) {
	super(products);
    }
    
    public Map<Integer, Monitor> getProductsByManufacturer(String manufacturer){
	Map<Integer, Monitor> productsByManufacturer = new HashMap<>();
	super.getProducts().entrySet().stream().filter(entry -> (entry.getValue().getManufacturer().equals(manufacturer))).forEachOrdered(entry -> {
	    productsByManufacturer.put(entry.getKey(), entry.getValue());
	});
	return productsByManufacturer;
    }
}
