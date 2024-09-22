package package4;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapToTreeMapExample {
	public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Three", 3);
        hashMap.put("Two", 2);
        hashMap.put("Four", 4);

        // Convert HashMap to TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Print the TreeMap
        System.out.println("Converted TreeMap: " + treeMap);
    }
}
