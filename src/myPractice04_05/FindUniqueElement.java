package myPractice04_05;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueElement {
	
	/*
	   Create a method to return just non-repeated element or elements
	 	[3, 2, 5, 5, 1, 3, 1] ==> [2]
	 	[3, 2, 5, 5, 7, 3, 1] ==> [2, 7, 1]
	 */

	public static void main(String[] args) {
		
		int arr [] = {3, 2, 5, 5, 7, 3, 1};
		
		System.out.println(findUniqueEl(arr));
	}
	
	public static List<Integer> findUniqueEl(int arr[]) {
		
		List<Integer>list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] != arr[j] && !list.contains(arr[i])) {
					list.add(arr[i]);
				}
			}
		}
		
		return list;
	}

}
