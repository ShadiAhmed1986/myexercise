package interviewQuestions;

import java.util.Scanner;

public class FactorialOfANumber {
	
	/* 
    ===>>>> COMMON INTERVIEW QUESTION <<<====
 TYPE A CODE TO CALCULATE TEH FACTORIAL OF A GIVEN NUMBER

Ask user to enter beginning and ending values 
Type a code to calculate the multiplication of the integers from the beginning 
to ending values
*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter beginning value !");
		int start = scan.nextInt();
		System.out.println("Please enter ending value !");
		int end = scan.nextInt();
		
		int factorial = 1;
		for (int i = start; i <= end; i++) {
			factorial *= i;
		}
		System.out.println(factorial);	
	}

}
