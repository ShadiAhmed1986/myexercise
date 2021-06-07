package myPractice07_06;

public class ScoresClump {
	
	/*
	 	Given an array of scores sorted in increasing order, 
	 	return true if the array contains 3 adjacent scores 
	 	that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
	 */

	public static void main(String[] args) {
		
		int arr[] = {1, 3, 5, 5};
		
		System.out.println(scoresClump(arr));;
	}
	
	public static boolean scoresClump(int[] arr) {
		
		int counter1 = 0;
		int counter2 = 0;
		boolean result = false;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-arr[i-1] <= Math.abs(1)) {
				counter1++;
			}
			if(arr[i]-arr[i-1] <= Math.abs(2)) {
				counter2++;
			}
		}
		
		if(counter1 > 2 || counter2 > 2) {
			result = true;
		}else {
			result = false;
		}
		
		
		return result;
		  
	}

}
