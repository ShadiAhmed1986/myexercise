package MyPracticePkg;

import java.util.Scanner;

public class Do_While_Loop_01 {
	
	public static void main(String[] args) {
		//findFactorOfInt();
		printOddIndexChar();
	}
	
	public static void findFactorOfInt() {
		
		/*
	    Type java code by using while loop,
    	Write a program to count the factors of an 
        integer which is entered by user
	    */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer !");
		
		int num = scan.nextInt();
		
		int i = 1;
		int count = 0;
		while(i < num) {
			if(num % i == 0) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("The number of factors in your number is " + count);
		scan.close();
	}
	
	public static void printOddIndexChar() {
		
		/*
		  Ask user to enter a String
          Print the characters whose indexes are odd on the console
          For example; Germany ==> e m n
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String !");
	
		String s = scan.nextLine();
		
		int i = 0;
		while(i < s.length()-1) {
			if(i % 2 != 0) {
				System.out.print(s.charAt(i) + " ");
			}
			i++;
		}
		scan.close();
	}

}
