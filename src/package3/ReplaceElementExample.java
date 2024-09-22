package package3;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElementExample {
public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Date");

    System.out.println("Original List: " + fruits);

    // Replace the element at index 1(Banana) with "Blueberry"
    
    int indexToReplace = 1;
    String newElement = "Blueberry";
    fruits.set(indexToReplace, newElement);

    System.out.println("List After Replacement: " + fruits);
}
}
