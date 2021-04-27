package myPractice15_04;

import java.util.Scanner;

public class CheckSameChar {
	
	/*
	   Ask user to type a name, the length of name should be 3.
		Then check if the name has same characters.
		If the String has same characters
			Print “String has duplicate characters”
		Else
			Print “String has unique characters”
			
			Use ternary
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name(max 3 character)");
		String name = scan.next();
		
		char c1 = name.charAt(0);
		char c2 = name.charAt(1);
		char c3 = name.charAt(2);
		
		String result = name.length()== 3 &&  c1 == c2 || c1 == c3 || c2 == c3 ? 
				"String has duplicate characters" : "String has unique characters";

		System.out.println(result);
		scan.close();
	}

}
