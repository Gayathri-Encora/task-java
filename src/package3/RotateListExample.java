package package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateListExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Original List: " + fruits);

        // Rotate the list to the right by 2 positions
        Collections.rotate(fruits, 2);
        System.out.println("List After Right Rotation: " + fruits);

        // Rotate the list to the left by 3 positions
        Collections.rotate(fruits, -3);
        System.out.println("List After Left Rotation: " + fruits);
    }
}
