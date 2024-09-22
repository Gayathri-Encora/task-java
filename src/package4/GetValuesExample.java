package package4;

import java.util.Collection;
import java.util.LinkedHashMap;

public class GetValuesExample {

    public static void main(String[] args) {
        // Create a LinkedHashMap and populate it
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);
        linkedHashMap.put("Date", 40);

        // Get all values using values() method
        Collection<Integer> values = linkedHashMap.values();

        // Displaying the values
        System.out.println("Values in the LinkedHashMap:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
