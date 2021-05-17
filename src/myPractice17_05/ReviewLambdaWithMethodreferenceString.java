package myPractice17_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReviewLambdaWithMethodreferenceString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        printStartingWithA(list);
        System.out.println();
        startWithAOrEndingWithO(list);
        System.out.println();
        printInUpCaseOrderByLength(list);
        System.out.println();
        printIfLengthLessthanFive(list);
        System.out.println();
        System.out.println(removeIfLengthLessthanFive(list));;

	}
	
	/*
	   1)Functional Programming
	   Create a method to print list element, which are starting with "A" in uppercases
	 */
	
	public static void printStartingWithA(List<String>list) {
		list.stream()
		.filter(Utils::startWithA)
		.map(String::toUpperCase)
		.forEach(t->System.out.print(t + " "));
	}
	
	/*
	   2)Functional Programming
	   Create a method to print list element, which are starting with "A" 
	   or endinging with "o" in lowercases
	 */
	
	public static void startWithAOrEndingWithO(List<String>list) {
		list.stream().filter(t->t.startsWith("A") || t.endsWith("o")).forEach(t->System.out.print(t + " "));
	}
	
	/*
	  3)Functional Programming
	  Create a method to print the elements in uppercases 
	  after ordering according to their lengths.
	 */
	
	public static void printInUpCaseOrderByLength(List<String>list) {
		list.stream()
		.map(t->t.toUpperCase())
		.sorted(Comparator.comparing(String::length))
		.forEach(t->System.out.print(t + " "));
	}
	
	/*
	 4)Functional Programming
	 Create a method to print the elements, if the length is less than 5
	 */
	public static void printIfLengthLessthanFive(List<String> list) {
		list.stream()
		.filter(t->t.length()<5)
		.forEach(t->System.out.print(t + " "));
	}
	
	/*
	 5)Functional Programming
	 Create a method to remove the elements, if the length is less than 5
	 
	 If you want to use remove methods, don't use stream(). Work with list directly.
	 */
	public static List<String> removeIfLengthLessthanFive(List<String>list) {
		list.removeIf(t->t.length()<5);
		return list;
	}
}
