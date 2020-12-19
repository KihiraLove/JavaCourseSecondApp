package com.pb8jv3.java1.webshopapp.datamanager;

import com.pb8jv3.java1.webshopapp.datamanager.data.Monitor;
import com.pb8jv3.java1.webshopapp.filemanager.ReadFromFile;
import com.pb8jv3.java1.webshopapp.filemanager.utility.FileLocation;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class ProductManager extends Manager {

    public ProductManager() throws FileNotFoundException {
	super(ReadFromFile.readProducts(FileLocation.PRODUCT_DATA_FILE_LOCATION));
    }
    
    public Map<Integer, Monitor> getProductsByManufacturer(String manufacturer){
	Map<Integer, Monitor> productsByManufacturer = new LinkedHashMap<>();
	super.getProducts().entrySet().stream().filter(entry -> (entry.getValue().getManufacturer().equals(manufacturer))).forEachOrdered(entry -> {
	    productsByManufacturer.put(entry.getKey(), entry.getValue());
	});
	return productsByManufacturer;
    }
}
