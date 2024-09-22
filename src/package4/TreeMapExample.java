package package4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	    public static void main(String[] args) {
	        // Create a TreeMap and populate it
	        TreeMap<Integer, String> treeMap = new TreeMap<>();
	        treeMap.put(10, "Ten");
	        treeMap.put(20, "Twenty");
	        treeMap.put(30, "Thirty");
	        treeMap.put(40, "Forty");
	        treeMap.put(50, "Fifty");

	        // Specify a value to compare
	        int specifiedValue = 25;

	        // Get the first key greater than the specified value
	        Integer higherKey = treeMap.higherKey(specifiedValue);
	        System.out.println("First key greater than " + specifiedValue + ": " + higherKey);

	        // Get the first key less than the specified value
	        Integer lowerKey = treeMap.lowerKey(specifiedValue);
	        System.out.println("First key less than " + specifiedValue + ": " + lowerKey);

	        // Get the first entry greater than the specified value
	        Map.Entry<Integer, String> higherEntry = treeMap.higherEntry(specifiedValue);
	        System.out.println("First entry greater than " + specifiedValue + ": " + higherEntry);

	        // Get the first entry less than the specified value
	        Map.Entry<Integer, String> lowerEntry = treeMap.lowerEntry(specifiedValue);
	        System.out.println("First entry less than " + specifiedValue + ": " + lowerEntry);
	    }
	}


