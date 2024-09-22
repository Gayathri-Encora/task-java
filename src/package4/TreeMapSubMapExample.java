package package4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSubMapExample {
	public static void main(String[] args) {
        // Create a TreeMap and populate it
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        // Define the range for the sub-map
        int fromKey = 20;
        int toKey = 40;

        // Get the sorted sub-map
        Map<Integer, String> subMap = treeMap.subMap(fromKey, toKey);

        // Print the sorted sub-map
        System.out.println("Sorted Sub-Map from " + fromKey + " to " + toKey + ": " + subMap);
    }

}
