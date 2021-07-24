package myPractice;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		  Ask user to enter password
			 If the password has more than 6 characters print "it is okay"
			 Otherwise, print "Make the password longer than 6 characters" 
			 and ask user to enter a new password
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String password= "";
		
		do {
			System.out.println("Please enter the password");
			password = scan.next();
			if(password.length() > 6) {
				System.out.println("It's OK");
			}else {
				System.out.println("Make the password longer than 6 chars");
			}
			
		}while(password.length() <= 6);
	}
	

}
