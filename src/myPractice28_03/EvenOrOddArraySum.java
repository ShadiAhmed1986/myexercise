package myPractice28_03;

public class EvenOrOddArraySum {
	
	/*
	  Define if the sum of the array elements is even or odd
	 */

	public static void main(String[] args) {
		
		int arr [] = {2,5,8,2,8,9,23};
		
		System.out.println(evenOrOdd(arr));
	}
	
	public static String evenOrOdd(int arr[]) {
		
		if(arr.length > 0) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + i;
			}

			if(sum % 2 == 0) {
				return "even";
			}
			return "odd";
		}else {
			return "empty array";
		}
		
	}

}
