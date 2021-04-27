package interviewQuestions;

import java.util.Scanner;

public class FactorialUsingWhileLoop {
	
	/* 
    ===>>> INTERVIEW QUESTION  <<=====

    Get an integer from user and calculate the factorial

    For example: 
    user ->>> 5 ===>> 5 = 120

    Use while loop ...
    */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number !");
		int num = scan.nextInt();
		
		int factorial = 1;
		int i = 1;
		while(i <= num) {
			factorial *= i;
			i++;
		}
		System.out.println(factorial);
		scan.close();
	}

}
