package package4;

import java.util.TreeMap;

public class TreeMapWithComparatorExample {
	public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>(new AgeComparator());

        // Populate the TreeMap
        treeMap.put(new Student("Alice", 30, "Java"), "Java Developer");
        treeMap.put(new Student("Bob", 25, "SQL"), "SQL Developer");
        treeMap.put(new Student("Charlie", 35, "Python"), "Python Developer");
        treeMap.put(new Student("David", 28, ".NET"), ".NET Developer");

        // Print the TreeMap
        System.out.println("TreeMap sorted by age:");
        for (Student student : treeMap.keySet()) {
            System.out.println(student + " -> " + treeMap.get(student));
        }
	}
}
