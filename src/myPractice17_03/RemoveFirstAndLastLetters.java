package myPractice17_03;

import java.util.Scanner;

public class RemoveFirstAndLastLetters {
	
	/*
	   StringMethods
    Write a Java program to read a string and if the first or last characters are 't',
    return the string without those 't' otherwise return the string unchanged.
     Example   :
     INPUT     :   The given strings is: testcricket
     OUTPUT    :   The new string is: estcricke
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please entr a String !");
		String str = scan.next();
		
		String newstr = "";
		
		if(str.charAt(0) == 't' && str.charAt(str.length()-1) == 't') {
			newstr = str.substring(1, str.length()-1);
		}else if(str.charAt(0) == 't') {
			newstr = str.substring(1);
		}else if(str.charAt(str.length()-1) == 't') {
			newstr = str.substring(0, str.length()-1);
		}else {
			newstr = str;
		}
		System.out.println(newstr);
		scan.close();
	}

}
