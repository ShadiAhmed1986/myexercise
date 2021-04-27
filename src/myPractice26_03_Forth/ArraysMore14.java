package myPractice26_03_Forth;

public class ArraysMore14 {
	
	/*
	   Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
	 */

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 1, 4, 1};
		
		System.out.println(more14(arr));
	}

	public static boolean more14(int[] nums) {
		int fours = 0;
		int ones = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				ones++;
			}else if(nums[i] == 4) {
				fours++;
			}
		}
		
		if (ones > fours) {
			return true;
		}
		return false;
		
	}
}
