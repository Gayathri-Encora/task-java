package package2;

import java.util.LinkedHashSet;
import java.util.Random;

public class RandomElementFromLinkedHashSet {
	public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        // Convert LinkedHashSet to an array
        //you specify that you want the resulting array to be of type String.
        String[] elements = set.toArray(new String[0]);
        Random random = new Random();

        // Get a random element
        //generate the random element from the linkedhashset 
        String randomElement = elements[random.nextInt(elements.length)];
        System.out.println("Random Element: " + randomElement);
    }

}
