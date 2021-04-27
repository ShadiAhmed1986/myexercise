package myPractice23_03;

import java.util.ArrayList;
import java.util.List;

public class ReviewInterviewQ02 {
	
	/*
	   Create a method to return just non-repeated element or elements
	 	[3, 2, 5, 5, 1, 3, 1] ==> [2]
	 	[3, 2, 5, 5, 7, 3, 1] ==> [2, 7, 1]
	 */

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(5);

		System.out.println(uniqueElement(list));
	}
	
	public static List<String> uniqueElement(List<Integer> list){
		List<String> result = new ArrayList<>();
		
		String str = "";
		
		for (Integer w : list) {
			str += w;
		}
		for (int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.substring(i, i+1))== str.lastIndexOf(str.substring(i, i+1))) {
				result.add(str.substring(i, i+1));
			}
		}
		return result;
		
	}

}
