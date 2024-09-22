package package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;



public class SortLinkedHashSet {

    public static void main(String[] args) {
        // Create a LinkedHashSet and add some elements
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Date");

        // Convert LinkedHashSet to List
        List<String> fruitList = new ArrayList<>(fruits);

        // Sort the List using Comparable
        Collections.sort(fruitList);

        // Optional: Convert back to LinkedHashSet if needed
        LinkedHashSet<String> sortedSet = new LinkedHashSet<>(fruitList);

        // Print the sorted LinkedHashSet
        System.out.println("Sorted LinkedHashSet Elements:");
        for (String fruit : sortedSet) {
            System.out.println(fruit);
        }
    }
}
