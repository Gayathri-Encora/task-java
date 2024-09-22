package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {
	public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Cherry", 15);
        hashMap.put("Date", 8);
        hashMap.put("Elderberry", 12);

        // Print the original HashMap
        System.out.println("Original HashMap: " + hashMap);

        // Sort the HashMap by values
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

        // Sort the list using a custom comparator
        Collections.sort(list, (a, b) -> a.getValue().compareTo(b.getValue()));

        // Create a LinkedHashMap to maintain the order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted HashMap
        System.out.println("Sorted HashMap by Value: " + sortedMap);
    }

}
