package myPractice01_04;

public class CreatePhoneNumber {

	/*
	  Write a function that accepts an array of 10 integers (between 0 and 9), 
	  that returns a string of those numbers in the form of a phone number.

Example:
createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) 
                => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!
	 */
	
	public static void main(String[] args) {
		
		int arr [] = {7,4,2,9,1,5,0,5,0,7};
		
		String strnum = "";
		for (int i = 0; i < arr.length; i++) {
			strnum += String.valueOf(arr[i]);
		}
		System.out.println(strnum);
		String readynum = "(" + strnum.substring(0, 3) + ") " + strnum.substring(3, 6) 
		                + "-" + strnum.substring(6);
		System.out.println(readynum);		
		
	}

}
