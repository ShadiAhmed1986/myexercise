package myPracticeLambda23_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {
	
	/*
	 	Given a list of non-negative integers, 
	 	return a list of those numbers except omitting any that end with 9. (Note: % by 10)


no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
	 */

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(19);
		list.add(9);
		list.add(29);
		
		System.out.println(no9(list));
	}
	
	public static List<Integer> no9(List<Integer> nums) {
		  return nums.stream().filter(t->t % 10 != 9).collect(Collectors.toList());
	}

}
