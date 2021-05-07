package myPractice07_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindUniqueElUsingLambda {

	/*
	   Create a method to return just non-repeated element or elements

	 	int arr [] = {3, 2, 5, 5, 7, 3, 1} ==> 2, 7, 1
	 				 {3, 2, 5, 5, 1, 3, 1} ==> 2
	 */
	
	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		
		int arr[]= {3,2,5,5,7,7,3,1,9};
			
		for(int w:arr) {
			list.add(w);
		};
		
		list.stream().filter(t -> Collections.frequency(list, t) == 2).forEach(t->System.out.print(t+" "));
	}
	
}
