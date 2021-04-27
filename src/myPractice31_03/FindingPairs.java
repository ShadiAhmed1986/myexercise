package myPractice31_03;

import java.util.Scanner;

public class FindingPairs {
	
	/*
	   From a given array find all pairs whose sum is a given number
			  {4, 6, 5, -10, 8, 5, 20} ==> 10
			  For example;	
			  Output #
			  4+6=10, 5+5=10, -10+20=10
	 */

	public static void main(String[] args) {

		int arr [] = {4, 6, 5, -10, 8, 5, 20};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == num) {
					System.out.println(arr[i] + "+" + arr[j] +"=" +  num);
				}
			}
		}
		scan.close();	
	}

}
