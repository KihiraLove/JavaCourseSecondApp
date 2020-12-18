package com.pb8jv3.java1.webshopapp.filemanager;

import com.pb8jv3.java1.webshopapp.filemanager.utility.FileLocation;
import com.pb8jv3.java1.webshopapp.datamanager.WishlistManager;
import com.pb8jv3.java1.webshopapp.datamanager.ProductManager;
import com.pb8jv3.java1.webshopapp.datamanager.CartManager;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class WriteToFile {
    
    private WriteToFile() {
    }
    
    public static void write(ProductManager productManager) {
    	try (FileWriter writer = new FileWriter(FileLocation.PRODUCT_DATA_FILE_LOCATION)) {
	    productManager.getProducts().entrySet().forEach(entry -> {
		try {
		    writer.write(entry.getKey() + ";" + entry.getValue().printable());
		    writer.write(System.lineSeparator());
		} catch (IOException e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}
		});
	    System.out.println("Product data written to " + FileLocation.PRODUCT_DATA_FILE_NAME);
	    writer.close();
	} catch (IOException e) {
	    System.out.println("An error occurred: " + e.getMessage());
	}
    }
    
    public static void write(CartManager cartManager) {
    	try (FileWriter writer = new FileWriter(FileLocation.CART_DATA_FILE_LOCATION)) {
	    cartManager.getProducts().entrySet().forEach(entry -> {
		try {
		    writer.write(entry.getKey() + ";" + entry.getValue().printable());
		    writer.write(System.lineSeparator());
		} catch (IOException e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}
		});
	    System.out.println("Product data written to " + FileLocation.CART_DATA_FILE_NAME);
	    writer.close();
	} catch (IOException e) {
	    System.out.println("An error occurred: " + e.getMessage());
	}
    }
    
    public static void write(WishlistManager wishlistManager) {
    	try (FileWriter writer = new FileWriter(FileLocation.WISHLIST_DATA_FILE_LOCATION)) {
	    wishlistManager.getProducts().entrySet().forEach(entry -> {
		try {
		    writer.write(entry.getKey() + ";" + entry.getValue().printable());
		    writer.write(System.lineSeparator());
		} catch (IOException e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}
		});
	    System.out.println("Product data written to " + FileLocation.WISHLIST_DATA_FILE_NAME);
	    writer.close();
	} catch (IOException e) {
	    System.out.println("An error occurred: " + e.getMessage());
	}
    }
}
