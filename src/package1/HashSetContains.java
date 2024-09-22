package package1;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetContains {

	public static void main(String[] args) {
		HashSet<String> username=new HashSet<>();
		username.add("Gayathri");
		username.add("Subasreee");
		username.add("Deepa");
		username.add("Zaiba");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username: ");
		String name=sc.next();
		
		boolean usercheck=username.stream().map(String::toLowerCase).anyMatch(u->u.equals(name.toLowerCase()));
				
	                
		
		if(usercheck) {
			System.out.println("User already registered!!");
		}
		else {
			System.out.println("New User");
		}
		
		

	}

}
