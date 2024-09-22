package package2;

import java.util.LinkedHashSet;

public class PrintLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("one");
        fruits.add("two");
        fruits.add("three");
        fruits.add("four");

        // Print using an enhanced for-loop
        System.out.println("Using Enhanced For-Loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
