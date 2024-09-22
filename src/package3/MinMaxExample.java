package package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Finding min and max using a loop
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        //using collection
        
        int min1 = Collections.min(numbers);
        int max1 = Collections.max(numbers);
System.out.println("using collection");
        System.out.println("Minimum: " + min1);
        System.out.println("Maximum: " + max1);
    }
}
