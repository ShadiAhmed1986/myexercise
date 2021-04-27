package myPractice02;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {
		
		/*
		   Create a method that takes a String and returns a new String 
		   with its first and last characters swapped, except under 2 conditions:
		    1) If the length is less than two, return "Incompitable"
		    2) If the first and last characters are same, return "Two's a pair."
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String !");
		String str = scan.next();
		
        String swapped = "";
		
		if(str.length()<2) {
			System.out.println("Incompitable");;
		}else if(str.charAt(0) == str.charAt(str.length()-1)) {
			 System.out.println("Two's a pair.");
		}else {
			swapped = str.substring(str.length()-1, str.length()) + str.substring(1, str.length()-1)+str.substring(0, 1);
		}
		System.out.println(swapped);
		
		scan.close();
	}
	
}
