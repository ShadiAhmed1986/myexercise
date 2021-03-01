package MyPracticePkg;

import java.util.Scanner;

public class For_Loop_01 {

	public static void main(String[] args) {
		//printOddNumbers();
		//addCountingNumbers();
		//multiplyCountingNumbers();
		//printCountingNumbersLess200Div5();
		//reversInt();
		//drawATriangle();
		checkPalindrome();
	}

	public static void printOddNumbers() {
	
		/*
		   Write a program to print odd counting numbers from 200 to 33 
		   on the console by using for-loop.
		 */
		
		for (int i = 200; i >= 33; i--) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void addCountingNumbers() {
		
		/*
		    Write a program to add counting numbers from 23 to 57 by using for-loop.
		 */
		
		int sum = 0;
		for (int i = 23; i <= 57; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of counting numbers is " + sum);
	}
	
	public static void multiplyCountingNumbers() {
		
	/*
       Write a program to multiply counting numbers from 7 to 15 by using for-loop.
	 */
		
		int result = 1;
		for(int i = 7; i <= 15; i++) {
			result = result * i;
		}
		System.out.println("The result for multiplied numbers is : " + result);
	}
	
	public static void printCountingNumbersLess200Div5() {
		
	
	/*
	   Write a program to print counting numbers
	   which are less than 200 and divisible by 5 On the console by using for-loop.
	 */
		
		for(int i = 200; i > 0; i--) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void reversInt() {
		
		/*
		Write a program that prompts the user to input an integer
		and then outputs the number with the digits reversed. 
		For example, if the input is 12345, the output should be 54321
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an multiple digit integer !");
		String num = scan.next();
		
		String reversedNum = "";
		for(int i = num.length()-1; i >= 0; i--) {
			reversedNum = reversedNum + num.charAt(i);
		}
		System.out.println(reversedNum);
	}
	
	public static void drawATriangle() {
		
		/* 45)
		1)Ask user to enter a positive integer
		2)Create and print the following image on the console

							       *
							      * *
							     * * *
							    * * * *				
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer !");
		int n = scan.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			for(int j = n - i; j > 0 ; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void checkPalindrome() {
		
		/* 42)
		   ====>> VERY COMMON INTERVIEW QUESTION <<====
		 
		      1)Ask user to enter a String
			  2)Check the String if it is “Palindrome” or not
			  
			  For Example: "aba" and "aba"
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String !");
		String str = scan.next();
		
		String reversedStr = "";
		for (int i = str.length()-1; i >= 0 ; i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		if(str.equals(reversedStr)) {
			System.out.println(str.toUpperCase() + " is a Palindrome");
		}else {
			System.out.println(str.toUpperCase() + " is not a Palindrome");
		}
		
		scan.close();
	}
	
}
