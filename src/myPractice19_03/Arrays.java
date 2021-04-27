package myPractice19_03;

public class Arrays {
	/*
	  Find the difference between the largest and the smallest element of the array
	 */

	public static void main(String[] args) {
		
		int arr[] = {100, 6, 1, 19, -20};
	
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.println(min);
		System.out.println(max);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
