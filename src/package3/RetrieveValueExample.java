package package3;

import java.util.HashMap;

public class RetrieveValueExample {
	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();

	        // Adding key-value pairs to the HashMap
	        map.put("Apple", 10);
	        map.put("Banana", 20);
	        map.put("Cherry", 30);

	        // Retrieving values using keys
	        String keyToRetrieve = "Banana";
	        Integer value = map.get(keyToRetrieve);

	        if (value != null) {
	            System.out.println("Value associated with key '" + keyToRetrieve + "': " + value);
	        } else {
	            System.out.println("Key '" + keyToRetrieve + "' not found in the HashMap.");
	        }

	        // Attempting to retrieve a value for a key that doesn't exist
	        keyToRetrieve = "Grape";
	        value = map.get(keyToRetrieve);

	        if (value != null) {
	            System.out.println("Value associated with key '" + keyToRetrieve + "': " + value);
	        } else {
	            System.out.println("Key '" + keyToRetrieve + "' not found in the HashMap.");
	        }
	    }
	}


