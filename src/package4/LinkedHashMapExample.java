package package4;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	    public static void main(String[] args) {
	        // Create a LinkedHashMap
	        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);

	        // Print all mappings
	        System.out.println("Using entry set: ");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        System.out.println("Using key set(): ");
	        
	        for (String key : map.keySet()) {
	            System.out.println(key + ": " + map.get(key));
	        }
	        System.out.println("Using for each: ");
	        
	        map.forEach((key, value) -> System.out.println(key + ": " + value));
	    }
	}



