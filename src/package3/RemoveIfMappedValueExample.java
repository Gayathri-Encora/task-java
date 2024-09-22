package package3;

import java.util.HashMap;

public class RemoveIfMappedValueExample {
	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();

	        // Adding key-value pairs to the HashMap
	        map.put("Apple", 10);
	        map.put("Banana", 20);
	        map.put("Cherry", 30);

	        // Displaying the original map
	        System.out.println("Original HashMap: " + map);

	        // Attempting to remove a key-value pair
	        String keyToRemove = "Banana";
	        int valueToRemove = 20;

	        // Remove only if the key is mapped to the specified value
	        if (map.remove(keyToRemove, valueToRemove)) {
	            System.out.println("Removed key-value pair: " + keyToRemove + " = " + valueToRemove);
	        } else {
	            System.out.println("Key-value pair not found: " + keyToRemove + " = " + valueToRemove);
	        }

	        // Attempting to remove a key-value pair with a wrong value
	        keyToRemove = "Cherry";
	        valueToRemove = 25; // Wrong value

	        if (map.remove(keyToRemove, valueToRemove)) {
	            System.out.println("Removed key-value pair: " + keyToRemove + " = " + valueToRemove);
	        } else {
	            System.out.println("Key-value pair not found: " + keyToRemove + " = " + valueToRemove);
	        }

	        // Displaying the final map
	        System.out.println("Final HashMap: " + map);
	    }
}

