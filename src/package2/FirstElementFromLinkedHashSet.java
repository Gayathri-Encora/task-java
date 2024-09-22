package package2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class FirstElementFromLinkedHashSet {
	public static void main(String[] args) {
        // Create a LinkedHashSet and add some elements
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Retrieve the first element
        String firstElement = getFirstElement(fruits);

        // Print the first element
        System.out.println("First Element: " + firstElement);
    }
	 public static String getFirstElement(LinkedHashSet<String> set) {
	        Iterator<String> iterator = set.iterator();
	        //ternary operator
	        return iterator.hasNext() ? iterator.next() : "NO Elements"; 
	        // Return null if set is empty
	    }
}
