package package4;

import java.util.LinkedHashMap;

public class LinkedHashMapKeysExample {
	 public static void main(String[] args) {
	        // Create a LinkedHashMap
	        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
	        map.put("a", 1);
	        map.put("b", 2);
	        map.put("c", 3);

	        // Print all keys
	        for (String key : map.keySet()) {
	            System.out.println(key);
	        }
	    }

}
