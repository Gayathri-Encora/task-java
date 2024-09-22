package package2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LastElementFromLinkedHashSet {

    public static void main(String[] args) {
        // Create a LinkedHashSet and add some elements
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("gayu");

        // Retrieve the last element
        String lastElement = getLastElement(fruits);

        // Print the last element
        System.out.println("Last Element: " + lastElement);
    }

    // Method to get the last element
    public static String getLastElement(LinkedHashSet<String> set) {
        String lastElement = null; // Initialize lastElement
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            lastElement = iterator.next(); // Update lastElement with the current element
        }
        
        return lastElement; // Return the last element found
    }
}
