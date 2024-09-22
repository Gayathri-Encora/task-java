package package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public class SortLinkedHashSetDescending {
    public static void main(String[] args) {
        // Create a LinkedHashSet and add some elements
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Date");

        // Convert LinkedHashSet to List
        List<String> fruitList = new ArrayList<>(fruits);

        // Sort the List in descending order
        //Collections.sort(fruitList, Comparator.reverseOrder()), 
        //the fruitList is sorted such that the highest value comes 
        //first and the lowest comes last based on the natural ordering of the strings.
        Collections.sort(fruitList, Comparator.reverseOrder());

        // Optional: Convert back to LinkedHashSet if needed
        LinkedHashSet<String> sortedSet = new LinkedHashSet<>(fruitList);

        // Print the sorted LinkedHashSet
        System.out.println("Sorted LinkedHashSet Elements in Descending Order:");
        for (String fruit : sortedSet) {
            System.out.println(fruit);
        }
    }
}
