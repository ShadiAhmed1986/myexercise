package myPracticeLambda23_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStars {
	
	/*
	 	
Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]

	 */

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("hello");
		list.add("there");
		list.add("*");

		System.out.println(addStar(list));
	}
	
	public static List<String> addStar(List<String> strings) {
		
		return strings.stream().map(t->t.concat("*")).collect(Collectors.toList());
		
	}

}
