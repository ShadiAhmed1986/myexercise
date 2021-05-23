package myPracticeLambda23_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
	
	/*
	 	Given a list of integers, return a list of those numbers, 
	 	omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
	 */

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(20);
		list.add(13);
		list.add(14);
		list.add(1);
		
		System.out.println(noTeen(list));
	}
	
	public static List<Integer> noTeen(List<Integer> nums) {
		
		return nums.stream().filter(t->t<13 || t>19).collect(Collectors.toList());
	}

}
