package package1;

class Person implements Comparable<Person> {
    String name;
    int marks; // Changed from 'age' to 'marks' based on your context

    // Constructor
    Person(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Implementing compareTo method to compare by marks
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.marks, other.marks); // Compare by marks
    }

    // Override toString to provide a meaningful representation
    @Override
    public String toString() {
        return name + " (" + marks + ")"; // Customize output format
    }
}

