package myPractice07_06;

public class Scores100 {
	
	/*
	 	Given an array of scores, 
	 	return true if there are scores of 100 next to each other in the array. 
	 	The array length will be at least 2.

scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
	 */

	public static void main(String[] args) {
		
		int arr[] = {1, 100, 99, 100};
		
		System.out.println(scores100(arr));;

	}
	
	public static boolean scores100(int[] arr) {
		
		  int counter = 0;
		  boolean result;
		  
		  for (int i = 1; i < arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				counter++;
			}
		}
		  if(arr.length>=2 && counter>=1) {
			  result=true;
		  }else {
			  result=false;
		  }
		  return result;
	}

}
