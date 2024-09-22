package package1;

import java.util.ArrayList;
import java.util.Collections;

public class SortPersons {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Gayathri", 100));
        people.add(new Person("Zaiba", 200));
        people.add(new Person("Chaithu", 300));

        // Sort the list using the compareTo method
        Collections.sort(people);

        // Print the sorted list
        System.out.println("Sorted list by Marks:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
