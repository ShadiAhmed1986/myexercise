package myPracticeLambda23_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
	
	/*
	 	Given a list of strings, 
	 	return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
	 */

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("hello");
		list.add("there");
		list.add("*");
		
		System.out.println(copies3(list));
		
	}
	
	public static List<String> copies3(List<String> strings) {
		  
		return strings.stream().map(t->t.concat(t).concat(t)).collect(Collectors.toList());
	}

}
