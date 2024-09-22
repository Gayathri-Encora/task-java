package package1;

import java.util.HashSet;

public class HashSetToArray {
	 public static void main(String[] args) {
	HashSet<String> hashSet = new HashSet<>();
    hashSet.add("Gayathri");
    hashSet.add("Deepa");
    hashSet.add("Suba");
    hashSet.add("Sri");

    // Print the original HashSet
    System.out.println("Original HashSet: " + hashSet);
    
    String[] ar = new String[hashSet.size()]; // Create an array of the same size
    hashSet.toArray(ar);
    
    System.out.println("Converted Array:");
    for (String fruit : ar) {
        System.out.println(fruit);
    }
    
	 }

}
