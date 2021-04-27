package myPractice17_03;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		
		/*
		   * Write a program Ask user to create a password it should have at least
			 * 1 Special char "!@#$%^&*()_+"
			 * 1 Uppercase letter "A"
			 * 1 Lower case letter "a"
			 * 1 Digit "0123456789"
			 * The minimum length of the password should be 8
			 * If everything is OK, print message as "Password creation successful!"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please create a password. It should have at least\n"
				+ "			 * 1 Special char \"!@#$%^&*()_+\"\n"
				+ "			 * 1 Uppercase letter \"A\"\n"
				+ "			 * 1 Lower case letter \"a\"\n"
				+ "			 * 1 Digit \"0123456789\"\n"
				+ "			 * The minimum length of the password should be 8");
		
		String pass = scan.next();
		
		String specChar = "!@#$%^&*()_+";
		
		int countSpecChar = 0;
		int countUpperCase = 0;
		int countLowerCase = 0;
		int digit = 0;
		
		for (int i = 0; i < pass.length(); i++) {
			if(specChar.contains(pass.substring(i, i+1))) {
				countSpecChar++;
			}
			if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
				countUpperCase++;
			}
			if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
				countLowerCase++;
			}
			if(Character.isDigit(pass.charAt(i))) {
				digit++;
			}
		}
		
		if(pass.length() >= 8) {
			if(countSpecChar > 0 && countUpperCase > 0 && countLowerCase > 0 && digit > 0) {
				System.out.println("Password creation successful!");
			}else {
				System.out.println("Please check your password again !");
			}
		}else {
			System.out.println("The minimum length of the password should be 8");
		}
		
		scan.close();
	}

}
