package package3;

import java.util.ArrayList;
import java.util.List;

public class SublistExample {
	public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Define the start and end indices for the sublist
        int startIndex = 1; // Inclusive
        int endIndex = 4;   // Exclusive

        // Get the sublist
        List<String> sublist = fruits.subList(startIndex, endIndex);

        // Print the original list and the sublist
        System.out.println("Original List: " + fruits);
        System.out.println("Sublist: " + sublist);
    }
}
