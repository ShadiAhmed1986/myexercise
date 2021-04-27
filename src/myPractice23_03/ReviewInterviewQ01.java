package myPractice23_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReviewInterviewQ01 {
	
	/*
	   Create a method which return two integers whose multiplication is the maximum
	
	12, 7, 3, 11, 8 ==> 12 and 11
	 */

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(6);

		System.out.println(maxMulti(list));
	}
	
	public static List<Integer> maxMulti(List<Integer> list){
		
		List<Integer> list2 = new ArrayList<>();
		
		Collections.sort(list);
		try {
			if(list.get(0)*list.get(1) > list.get(list.size()-1) * list.get(list.size()-2)) {
				list2.add(list.get(0));
				list2.get(list.get(1));
			}else {
				list2.add(list.get(list.size()-2));
				list2.add(list.get(list.size()-1));		
			}
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("The list must have at least 2 elements");
		}
		return list2;
	}

}
