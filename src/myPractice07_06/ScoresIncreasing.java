package myPractice07_06;

public class ScoresIncreasing {
	
	/*
	 	Given an array of scores, 
	 	return true if each score is equal or greater than the one before. 
	 	The array will be length 2 or more.

scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true
	 */

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,2,6};

		System.out.println(scoresIncreasing(arr));
	}
	
	public static boolean scoresIncreasing(int[] arr) {
		
		int counter = 0;
		boolean result;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>=arr[i-1]) {
				counter++;
			}
		}
		
		if(counter < arr.length-1) {
			result=false;
		}else {
			result = true;
		}
		
		return result;
	}

}
