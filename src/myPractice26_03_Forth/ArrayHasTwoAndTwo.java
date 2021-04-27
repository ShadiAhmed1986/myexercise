package myPractice26_03_Forth;

public class ArrayHasTwoAndTwo {
	
	/*
	   Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
	 */

	public static void main(String[] args) {
		
		int nums[] = {2, 1, 2};
		
		System.out.println(has22(nums));

	}	
	
	public static boolean has22(int[] nums) {
		  
		for (int i = 1; i < nums.length; i++) {
			if(nums[i-1] == 2 && nums[i-1] == nums[i]) {
				return true;
			}
		}
		return false;
	}
}
