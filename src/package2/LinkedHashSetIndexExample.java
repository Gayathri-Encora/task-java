package package2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIndexExample {

	    public static void main(String[] args) {
	        // Create a LinkedHashSet and add some elements
	        LinkedHashSet<String> fruits = new LinkedHashSet<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");

	        // Element to find
	        String elementToFind = "Date";
	        
	        // Find the index of the element
	        int index = findElementIndex(fruits, elementToFind);
	        
	        // Print the result
	        if (index != -1) {
	            System.out.println("The index of '" + elementToFind + "' is: " + index);
	        } else {
	            System.out.println("'" + elementToFind + "' is not found in the LinkedHashSet.");
	        }
	    }

	    // Method to find the index of an element
	    public static int findElementIndex(LinkedHashSet<String> set, String element) {
	        Iterator<String> iterator = set.iterator();
	        int index = 0;

	        while (iterator.hasNext()) {
	            String current = iterator.next();
	            if (current.equals(element)) {
	                return index; // Return the index if the element is found
	            }
	            index++;
	        }
	        
	        return -1; // Return -1 if the element is not found
	    }
	}

