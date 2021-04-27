package myPractice17_03;

import java.util.Scanner;

public class CheckIfContainsSpecificNumber {

	public static void main(String[] args) {
		
		/*
		  * Create a method to test if an array contains a specific value returns
        *   true or false
        * Then print the result in main method
        *
        * input[]= {1,2,3,4,5,6,7} num:6
        * Output : “Array contains 6”
		 */

		int input[]= {1,2,3,4,5,6,7};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to check if the Array contains it !");
		int num = scan.nextInt();
		
		if(checkIfContainsTheElement(input, num)) {
			System.out.println("The Array contains " + num);
		}else {
			System.out.println("The Array doesn't contain " + num);
		}
		scan.close();
	}
	
	public static boolean checkIfContainsTheElement(int arr[], int num) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}

}
