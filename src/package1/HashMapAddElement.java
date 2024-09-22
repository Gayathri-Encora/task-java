package package1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAddElement {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		String continueInput;
		do {

			System.out.print("Enter key: ");
			String key = sc.nextLine();

			System.out.print("Enter value: ");
			String value = sc.nextLine();
			map.put(key, value);
			System.out.println("Key-value pair added: " + key + " -> " + value);
			System.out.print("Do you want to add another entry? (yes/no): ");
			continueInput = sc.nextLine();

		} while (continueInput.equalsIgnoreCase("yes"));

		System.out.println("\nAll entries in the HashMap:");
		for (String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
	}

}
