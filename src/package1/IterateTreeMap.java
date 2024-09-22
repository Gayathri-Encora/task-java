package package1;

import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {
	public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Cherry");
        treeMap.put(2, "Date");
        treeMap.put(5, "Elderberry");

        // Print the original TreeMap
        System.out.println("Original TreeMap: " + treeMap);

        //  Iterating using entrySet()
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating using keySet()
        System.out.println("\nIterating using keySet():");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        //  Using forEach with Lambda Expression
        System.out.println("\nIterating using Java 8 forEach:");
        treeMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
