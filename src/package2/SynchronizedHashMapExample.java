package package2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMapExample {
	public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Wrap it in a synchronized map
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(hashMap);

        
        synchronizedMap.put("Apple", 50);
        synchronizedMap.put("Banana", 30);
        synchronizedMap.put("orange", 70); 
        synchronizedMap.put("lemon", 60); 
        synchronizedMap.put("custered", 90); 
        synchronizedMap.put("watermelons", 40); 
        synchronizedMap.put("Jack fruits", 20); 
        synchronizedMap.put("Guva", 80);
        
        // Synchronized block for safe iteration
        synchronized (synchronizedMap) {
            for (String key : synchronizedMap.keySet()) {
                System.out.println(key + ": " + synchronizedMap.get(key));
            }
        }
    }

}
