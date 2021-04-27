package myPractice17_03;

public class MinMaxValueOfArrayElements {
	
	/*
     * Write a method that accepts an integer array as input and prints the minimum
     * and the maximum numbers from given array
     *
     *
     * Input : {3,2,5,4,1,6}
     * Output : min: 1 max : 6
     *
     *
    
 */

	public static void main(String[] args) {
		
		int input[] = {3,2,5,4,1,6};
		
		findMinMax(input);
	}
	
	public static void findMinMax(int arr []) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Min value of the Array : " + min +"\nMax value of the Array: " + max);
	}

}
