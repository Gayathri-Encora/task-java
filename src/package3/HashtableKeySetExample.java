package package3;

import java.util.Hashtable;
import java.util.Set;

public class HashtableKeySetExample {
	public static void main(String[] args) {
        // Create a hash table and add some elements
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 10);
        hashtable.put("Banana", 5);
        hashtable.put("Cherry", 15);
        
        // Get the set view of keys
        Set<String> keySet = hashtable.keySet();
        
        // Print the keys
        System.out.println("Keys in the Hashtable:");
        for (String key : keySet) {
            System.out.println(key);
        }
	}
}
