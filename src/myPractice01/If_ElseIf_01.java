package myPractice01;

import java.util.Scanner;

public class If_ElseIf_01 {
	
	/*
	 Ask user to enter a letter, 
	 if it is uppercase check it is before “F” or not in alphabetical order.
     If it is before “F” in alphabetical order output will be “ Big before F”,
     otherwise output will be “Big after F.” 
     If it is lowercase check it is before “h” or not in alphabetical order.
     If it is before “h” in alphabetical order output will be “Small before h”, 
     otherwise “Small after h”
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a letter !");
		
		char letter = scan.next().charAt(0);
		
		//first check if it is upperCase
		if(letter >= 'A' && letter <= 'Z') {
			if(letter < 'F') {//then check if it is before F
				System.out.println("Big before F");
			}else { // if not before F ==>
				System.out.println("Big after F");
			}
		}else if(letter >= 'a' && letter <= 'z') { // check if it is lowerCase
			if(letter < 'h') {//check if it is before h
				System.out.println("Small before h");
			}else {// if not before h ==>
				System.out.println("Small after h");
			}
		}else { // if any other character ==>
			System.out.println("Please enter a correct letter !");
		}
		scan.close();
	}

}
