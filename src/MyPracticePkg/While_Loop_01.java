package MyPracticePkg;

import java.util.Scanner;

public class While_Loop_01 {

	public static void main(String[] args) {
		//printConsecutivOddNum();
		//multipTable();
		//factorialOfNumber();
		factorialOfNum();
	}

	public static void printConsecutivOddNum() {
		
	/*
		 Type java code by using while loop.
         Write a program that types first 30 consecutive odd integers.
	 */
		
		int i = 1;
		while(i <= 30) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}
	
	public static void multipTable() {
		
		/*
		  Type java code by using while loop,
	      Write a program that prompts the user to input a positive integer.
	   	  It should then print the multiplication table of that number.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number !");
		int num = scan.nextInt();
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i + " x " + num + " = " + num * i);
			i++;
		}
		scan.close();
		
	}
	
	public static void factorialOfNumber() {
		
		/*
		Type java code by using while loop,
  		Write a program that prompts the user to input a positive integer. 
  		It should then print factorial of that number.

		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number !");
		int num2 = scan.nextInt();
		
		int i = 1;
		int product = 1;
		while(i <= num2) {
			product = product * i;
			i++;
		}
		System.out.println(product);
		scan.close();
	}
	
	public static void factorialOfNum() {
		
		/*
		    Get an integer from user and calculate the factorial
  
  For example: 
  user ->>> 5 ===>> 5 = 120
  
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer !");
		int num = scan.nextInt();
		
		int i = 1;
		int product = 1;
		
		while(i <= num) {
			product = product * i;
			i++;
		}
		System.out.println("The factorial of " + num + " is : " + product);
		scan.close();
	}
}
