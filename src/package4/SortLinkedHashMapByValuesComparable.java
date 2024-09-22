package package4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortLinkedHashMapByValuesComparable {
	public static void main(String[] args) {
    // Create a LinkedHashMap and populate it
    LinkedHashMap<Fruit, Integer> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(new Fruit("Apple", 10), 10);
    linkedHashMap.put(new Fruit("Banana", 30), 30);
    linkedHashMap.put(new Fruit("Cherry", 20), 20);
    linkedHashMap.put(new Fruit("Date", 40), 40);

    // Display original LinkedHashMap
    System.out.println("Original LinkedHashMap: " + linkedHashMap);

    // Sort LinkedHashMap by values using Comparable
    List<Map.Entry<Fruit, Integer>> sortedEntries = linkedHashMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey()) // Sort by keys (which implement Comparable)
        .collect(Collectors.toList());

    // Create a new LinkedHashMap to maintain insertion order
    LinkedHashMap<Fruit, Integer> sortedMap = new LinkedHashMap<>();
    for (Map.Entry<Fruit, Integer> entry : sortedEntries) {
        sortedMap.put(entry.getKey(), entry.getValue());
    }

    // Display sorted LinkedHashMap
    System.out.println("Sorted LinkedHashMap by Values: " + sortedMap);
}
}