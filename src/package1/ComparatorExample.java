package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
	public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("zaiba", 22));
        students.add(new Student("biriyani", 20));
        students.add(new Student("noodles", 23));
        students.add(new Student("ice creame", 93));
        
        System.out.println("Before sorting: " + students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName()); // Sort by name
            }
        });
        System.out.println("after sorting: " + students);
        
	}
}
