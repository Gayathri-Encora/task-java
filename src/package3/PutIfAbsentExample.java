package package3;

import java.util.HashMap;

public class PutIfAbsentExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding initial key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);

        // Attempting to add a new key-value pair
        String keyToAdd = "Apple"; // Key that already exists
        int valueToAdd = 30;

        map.putIfAbsent(keyToAdd, valueToAdd); // This will not add the new value

        // Attempting to add a new key-value pair
        keyToAdd = "Cherry"; // New key
        valueToAdd = 25;
        
        map.putIfAbsent(keyToAdd, valueToAdd); // This will add the new value

        // Display the contents of the map
        System.out.println("HashMap contents: " + map);
    }
}
