package com.pb8jv3.java1.webshopapp.filemanager.utility;

import com.pb8jv3.java1.webshopapp.datamanager.data.DisplayType;
import com.pb8jv3.java1.webshopapp.datamanager.data.DisplaySize;
import com.pb8jv3.java1.webshopapp.datamanager.data.Monitor;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class MonitorsGenerator {
    
    private MonitorsGenerator() {
    }
    
    public static Map<Integer, Monitor> generateMonitors(){
	Map<Integer, Monitor> monitors = new HashMap<>();

	for(int i = 0; i < 100; i++){
	    monitors.put(i, generateMonitor());
	}
	
	return monitors;
    }
    
    private static Monitor generateMonitor(){
	Random random = new Random();
	
	String[] manufacturers = {"ASUS", "LG", "BenQ", "AOC Monitors", "Dell",
				    "Samsung Engineering", "Acer Inc.",
				    "Sony Corporation", "ViewSonic", "HP",
				    "Eizo", "Philips", "Iiyama", "Apple"};
	
	String[] aspectRatios = {"1024x768", "1600x1200", "1280x1024",
				    "2160x1440", "1920x1080", "2560x1080",
				    "5120x1440"};
	
	Integer[] refreshRates = {60, 75, 144, 165, 240, 100, 120};
	
	return new Monitor(manufacturers[random.nextInt(manufacturers.length)],
		    random.ints(48, 123)
			    .filter(ri -> (ri <= 57 || ri >= 65) && (ri <= 90 || ri >= 97))
			    .limit(8)
			    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			    .toString(),
		    aspectRatios[random.nextInt(aspectRatios.length)],
		    new DisplaySize(random.nextInt(40) + 60, random.nextInt(30) + 20),
		    random.nextInt(98000) + 2000,
		    DisplayType.getRandomType(),
		    refreshRates[random.nextInt(refreshRates.length)],
		    random.nextInt(600));
    }
}