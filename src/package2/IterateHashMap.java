package package2;

import java.util.HashMap;
import java.util.Iterator;

public class IterateHashMap {

public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Apple", 10);
    map.put("Banana", 5);
    map.put("Cherry", 15);
    
    // Using for-each loop on entrySet
    System.out.println("Using For-Each Loop:");
    for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
    System.out.println("Using Iterator:");
    Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
        HashMap.Entry<String, Integer> entry = iterator.next();
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
    System.out.println("Using Streams:");
    map.forEach((key, value) -> System.out.println(key + ": " + value));
 }
}