package package4;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "Gayathriiii"; // Sample input string

        // Create a LinkedHashMap to store character frequencies
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Traverse the input string
        for (char c : input.toCharArray()) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If it's not in the map, add it with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Print the characters and their frequencies
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
