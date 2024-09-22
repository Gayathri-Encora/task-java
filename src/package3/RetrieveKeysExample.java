package package3;

import java.util.HashMap;
import java.util.Set;

public class RetrieveKeysExample {
	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();

	        // Adding key-value pairs to the HashMap
	        map.put("Apple", 10);
	        map.put("Banana", 20);
	        map.put("Cherry", 30);
	        map.put("Date", 40);

	        // Retrieving all keys using keySet()
	        Set<String> keys = map.keySet();

	        // Printing all keys
	        System.out.println("Keys in the HashMap:");
	        for (String key : keys) {
	            System.out.println(key);
	        }
	    }
	}
