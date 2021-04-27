package interviewQuestions;

import java.util.Scanner;

public class Palindrome {
	
	/* 
	   ====>> VERY COMMON INTERVIEW QUESTION <<====
	 
	      1)Ask user to enter a String
		  2)Check the String if it is “Palindrome” or not
		  
		  For Example: "aba" and "aba"
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String !");
		String str = scan.next();
		
		System.out.println(checkPalindrome(str));
		
		scan.close();
	}

	public static String checkPalindrome(String s) {
		
		String s1 = "";
		for (int i = s.length()-1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		
		if(s.equals(s1)) {
			return "Palindrome";
		}else {
			return "Not Palindrome";
		}
	
	}
}
