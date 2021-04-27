package myPractice31_03;

import java.util.Scanner;

public class ArmstrongNumber {
	
	/*
	   A number is called an Armstrong number, 
	   if it equals to the sum of the cube of its every digit.
	   
 For example, 153 is an Armstrong number because of 153= 1 + 125 + 27,
 which is equal to 1^3+5^3+3^3.
 You need to write a program to check if the given number is Armstrong number or not.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number !");
		int num = scan.nextInt();
		
		int result = 0;
		int temp = num;
		while(temp > 0) {
			result += (temp % 10) * (temp % 10) * (temp % 10);
			temp = temp / 10;
		}
		
		if(result == num) {
			System.out.println("Armstrong number !");
		}else {
			System.out.println("Not an Armstrong number !");
		}

		scan.close();
	}

}
