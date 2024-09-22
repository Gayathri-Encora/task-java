package package4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ConvertLinkedHashMapValuesToList {

    public static void main(String[] args) {
        // Create a LinkedHashMap and populate it
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);
        linkedHashMap.put("Date", 40);

        // Display the original LinkedHashMap
        System.out.println("Original LinkedHashMap: " + linkedHashMap);

        // Convert LinkedHashMap values to a List
        List<Integer> valuesList = new ArrayList<>(linkedHashMap.values());

        // Display the List of values
        System.out.println("Values in List: " + valuesList);
    }
}
