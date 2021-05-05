package myPractice04_05;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueElement {
	
	/*
	   Create a method to return just non-repeated element or elements

	 	int arr [] = {3, 2, 5, 5, 7, 3, 1} ==> 2, 7, 1
	 				 {3, 2, 5, 5, 1, 3, 1} ==> 2
	 */

	public static void main(String[] args) {
		
		int arr [] = {3, 2, 5, 5, 7, 3, 1};
		
		List<Integer>list1 = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!list1.contains(arr[i])) {
				list1.add(arr[i]);
			}
		}
		
		System.out.println(list1);
		
		List<Integer>list2 = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					list2.add(arr[i]);
				}
			}
		}
		
		System.out.println(list2);
		
		list1.removeAll(list2);
		
		System.out.println(list1);

	}

}
