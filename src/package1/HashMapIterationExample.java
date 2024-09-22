package package1;

import java.util.HashMap;

public class HashMapIterationExample {

	public static void main(String[] args) {
		HashMap<String, String> status = new HashMap<>();
        status.put("Senior Manager", "Gayathri");
        status.put(".net", "Subasree");
        status.put("Python", "Chaithu");
        status.put("Manager", "Deepa");
        status.put("Java", "Zaiba");
        
        // Using key()
        System.out.println("Using keySet():");
        for (String position : status.keySet()) {
            String name = status.get(position);
            System.out.println(position + " : " + name);
        }

        //Using entrySet() to iterate through key-value pairs
        System.out.println("\nUsing entrySet():");
        for (HashMap.Entry<String, String> entry : status.entrySet()) {
            String a = entry.getKey();
            String b = entry.getValue();
            System.out.println( a + " : " + b);
        }

        // Using forEach with lambda expression (Java 8 and later)
        System.out.println("\nUsing forEach with lambda:");
        status.forEach((x, y) -> {
            System.out.println(x + " : " + y);
        });
    }
}


