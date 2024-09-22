package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListDescending {
	public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(3);
    numbers.add(8);
    numbers.add(1);
    numbers.add(7);

    // Print the original list
    System.out.println("Original ArrayList: " + numbers);

    // Sort the ArrayList in descending order
    Collections.sort(numbers, new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a); // Reverse order
        }
    });
    System.out.println("Sorted ArrayList (Descending): " + numbers);

}
}
