package myPractice22_04;

import java.util.ArrayList;
import java.util.List;

public class MinElement {
	
	/*
	  arr[]= {3,4,5, 7,8,9,12,34,7,8,90}; 
	  is given array, find the two elements who has min value  in a given list 
	  // output : [3,4];
	 */

	public static void main(String[] args) {
		
		int arr[]= {3,4,5,7,8,9,12,34,7,8,90};
		
		List<Integer> list = new ArrayList<>();
		
		int min1 = arr[0];
		int min2 = arr[1];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min1) {
				min1 =arr[i];	
			}
			if(arr[i] < min2 && arr[i] > min1) {
				min2 = arr[i];	
			}			
		}
		list.add(min1);
		list.add(min2);
		System.out.println(list);
	}

}
