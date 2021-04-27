package myPractice21_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxElements {

	public static void main(String[] args) {
		
		/*
		  arr[]= {3,4,5, 7,8,9,12,34,7,8,90}; 
		  is given array, find the maximum 3 element in a given list // output : [90, 34, 12];
		 */

		int arr[]= {3, 4, 5, 7, 8, 9, 12, 34, 7, 8, 90};
		
		List<Integer> list = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<>();
		for (int w : arr) {
			list.add(w);
		}
		
		int counter = 0;
		while(counter < 3) {
			int max = list.get(0);
			for(int i = 1; i < list.size(); i ++) {
				if(list.get(i) > max) {
					max = list.get(i);
				}
			}
			list2.add(max);
			counter++;
			list.remove(list.indexOf(max));
		}
		System.out.println(list2);
	}

}
