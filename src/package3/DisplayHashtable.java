package package3;

import java.util.Enumeration;
import java.util.Hashtable;

public class DisplayHashtable {
	public static void main(String[] args) {
        // Create a hashtable and add some elements
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 10);
        hashtable.put("Banana", 5);
        hashtable.put("Cherry", 15);
        
        // Display contents using Enumeration
        System.out.println("Contents of the Hashtable:");
        
        // Get keys enumeration
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            Integer value = hashtable.get(key);
            System.out.println(key + ": " + value);
        }
}
}
