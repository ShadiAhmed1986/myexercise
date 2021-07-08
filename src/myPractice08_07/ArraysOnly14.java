package myPractice08_07;

public class ArraysOnly14 {

	/*
	 	Given an array of ints, return true if every element is a 1 or a 4.


		only14([1, 4, 1, 4]) → true
		only14([1, 4, 2, 4]) → false
		only14([1, 1]) → true

	 */
	public static void main(String[] args) {
		
		int arr [] = {1, 4, 1, 4,3};

		System.out.println(only14(arr) );
	}
	
	public static boolean only14(int[] nums) {
	
		int counter=0;
		for(int i = 0; i < nums.length; i++) {
			if(!(nums[i]== 1 || nums[i] == 4)) {
				counter++;
			}
		}
		if(counter > 0) {
			return false;
		}
		return true;
	}

}
