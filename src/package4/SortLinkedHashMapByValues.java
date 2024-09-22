package package4;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.stream.Collectors;


public class SortLinkedHashMapByValues {
    public static void main(String[] args) {
        // Create a LinkedHashMap and populate it
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 30);
        linkedHashMap.put("Cherry", 20);
        linkedHashMap.put("Date", 40);

        // Display original LinkedHashMap
        System.out.println("Original LinkedHashMap: " + linkedHashMap);

        // Sort LinkedHashMap by values
        LinkedHashMap<String, Integer> sortedMap = linkedHashMap.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue()) // Sort by values
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (e1, e2) -> e1, 
                LinkedHashMap::new // Maintain insertion order
            ));

        // Display sorted LinkedHashMap
        System.out.println("Sorted LinkedHashMap by Values: " + sortedMap);
    }
}
