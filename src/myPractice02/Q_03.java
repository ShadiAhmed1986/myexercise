package myPractice02;

import java.util.Scanner;

public class Q_03 {
	
	/*
	   Type java code by using while loop,
    Write a program that prompts the user to input an integer.
    It should then find sum of the digits of that number.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number for finding the sum of its digits: ");
	    
	    int number = scan.nextInt();
	    
	    int sum = 0;
	    while(number > 0) {
	    	sum = sum + number % 10;
	    	number = number / 10;
	    }
	    System.out.println(sum);
	    scan.close();
	}

}
