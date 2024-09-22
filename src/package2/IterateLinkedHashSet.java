package package2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IterateLinkedHashSet {
	public static void main(String[] args) {
        // Create a LinkedHashSet and add some elements
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("\nUsing Enhanced For-Loop:");
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        
        System.out.println("\nUsing Streams:");
        fruits.stream().forEach(System.out::println);
	}
}
