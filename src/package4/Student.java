package package4;

public class Student {
	String name;
    int age;
    String language;

    Student(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", language='" + language + "'}";
    }

}
