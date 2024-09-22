package package4;

import java.util.HashMap;

public class ReplaceValueExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Displaying the original map
        System.out.println("Original HashMap: " + map);

        // Key to replace
        String keyToReplace = "Banana";
        int newValue = 25;

        // Replacing the value associated with the key
        map.put(keyToReplace, newValue);

        // Displaying the updated map
        System.out.println("Updated HashMap: " + map);
    }
}
