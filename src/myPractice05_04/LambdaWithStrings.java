package myPractice05_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithStrings {

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
        
        startingWithA(list);
        System.out.println();
        startingWithAEndingWithO(list);
        System.out.println();
        printByLength(list);
        System.out.println();
        printByLastChar(list);
        System.out.println();
        lengthOfElements(list);
        System.out.println();
        removeLessThanFive(list);
        System.out.println();
        System.out.println(checkLength(list));
        System.out.println(checkAnyLength(list));
        System.out.println(chekIfNoneLength(list));
        
	}
	
	/*
	   1)Functional Programming
	   Create a method to print list element, which are starting with "A" in uppercases
	 */
	public static void startingWithA(List<String> list) {
		list.stream().filter(t->t.startsWith("A")).forEach(t->System.out.print(t.toUpperCase() + " "));;
	}

	/*
	   2)Functional Programming
	   Create a method to print list element, which are starting with "A" 
	   or endinging with "o" in lowercases
	 */
	public static void startingWithAEndingWithO(List<String> list) {
		list.stream()
			.filter(t->t.startsWith("A") || t.endsWith("o"))
					.forEach(t->System.out.print(t.toLowerCase() + " "));
	}
	
	/*
	  3)Functional Programming
	  Create a method to print the elements in uppercases 
	  after ordering according to their lengths.
	  
	  NOTE: sorted() method puts the elements in natural order
	 */
	public static void printByLength(List<String> list) {
		list.stream()
			.map(t->t.toUpperCase())
				.sorted(Comparator.comparing(t->t.length()))
					.forEach(t->System.out.print(t + " "));
	}
	
	/*
	 4)Functional Programming
	 Create a method to print the elements in lowercases 
	 after ordering according to their last characters 
	 */
	public static void printByLastChar(List<String> list) {
		list.stream()
			.sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
				.forEach(t->System.out.print(t + " "));
	}
	
	/*
	 5)Functional Programming	
	 Create a method to print the length of every element in the following format.	  
	 Sort by length.	  Ali: 3        Mark: 4       Amanda: 6     etc.
	 */
	public static void lengthOfElements(List<String> list) {
		list.stream()
			.sorted(Comparator.comparing(t->t.length()))
				.map(t->t + ":" + t.length())
					.forEach(t->System.out.print(t+ " "));
	}
	
	/*
	 6)Functional Programming
	 Create a method to print the elements, if the length is less than 5
	 */
	public static void removeLessThanFive(List<String> list) {
		list.stream().filter(t->t.length()<5).forEach(t->System.out.print(t + " "));
	}
	
	/*
	 7)Functional Programming
	 Create a method to check, if the length of all elements is greater than 3
	 */
	public static boolean checkLength(List<String> list) {
		return list.stream().allMatch(t->t.length()>3);
	}
	
	/*
	 8)Functional Programming
	 Create a method to check, if the length of any element is 4
	 */
	public static boolean checkAnyLength(List<String> list) {
		return list.stream().anyMatch(t->t.length()==4);
	}
	
	/*
	 9)Functional Programming
	 Create a method to check, if no element has length 11
	 */
	public static boolean chekIfNoneLength(List<String> list) {
		return list.stream().noneMatch(t->t.length()==11);
	}

}
