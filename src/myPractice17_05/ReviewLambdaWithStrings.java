package myPractice17_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReviewLambdaWithStrings {

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
        startingWithAOrEndingWithO(list);
        System.out.println();
        printInUpperCaseAndSort(list);
        System.out.println();
        printLowerCaseLastChar(list);
        System.out.println();
        printLength(list);
        System.out.println();
        prinIfLengthLessThanFive(list);
        System.out.println();
        System.out.println(ifLengthGreaterThanThree(list));
        System.out.println(ifAnyLengthFour(list));
        System.out.println(nonElementLengthEleven(list));
        
	}
	
	/*
	   1)Functional Programming
	   Create a method to print list element, which are starting with "A" in uppercases
	 */
	
	public static void startingWithA(List<String> l) {
		l.stream().filter(t->t.startsWith("A")).forEach(t->System.out.print(t + " "));
	}
	
	/*
	   2)Functional Programming
	   Create a method to print list element, which are starting with "A" 
	   or endinging with "o" in lowercases
	 */
	
	public static void startingWithAOrEndingWithO(List<String> l) {
		l.stream().filter(t->t.startsWith("A") || t.endsWith("o")).forEach(t->System.out.print(t + " "));
	}
	
	/*
	  3)Functional Programming
	  Create a method to print the elements in uppercases 
	  after ordering according to their lengths.
	  
	  NOTE: sorted() method puts the elements in natural order
	 */
	
	public static void printInUpperCaseAndSort(List<String> l) {
		l.stream()
		.map(t->t.toUpperCase())
		.sorted(Comparator.comparing(t->t.length()))
		.forEach(t->System.out.print(t+ " "));
	}
	
	/*
	 4)Functional Programming
	 Create a method to print the elements in lowercases 
	 after ordering according to their last characters 
	 */
	
	public static void printLowerCaseLastChar(List<String> l) {
		l.stream()
		.map(t->t.toLowerCase())
		.sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
		.forEach(t->System.out.print(t + " "));
	}
	
	/*
	 5)Functional Programming	
	 Create a method to print the length of every element in the following format.	  
	 Sort by length.	  Ali: 3        Mark: 4       Amanda: 6     etc.
	 */
	
	public static void printLength(List<String> l) {
		l.stream()
		.sorted(Comparator.comparing(t->t.length()))
		.forEach(t->System.out.print(t + ":" + t.length() + " "));
	}
	
	/*
	 6)Functional Programming
	 Create a method to print the elements, if the length is less than 5
	 */
	
	public static void prinIfLengthLessThanFive(List<String> l) {
		l.stream().filter(t->t.length()< 5).forEach(t->System.out.print(t + " "));
	}
	
	/*
	 7)Functional Programming
	 Create a method to check, if the length of all elements is greater than 3
	 */
	
	public static boolean ifLengthGreaterThanThree(List<String> l) {
		return l.stream().allMatch(t-> t.length()>3);//false
	}
	
	/*
	 8)Functional Programming
	 Create a method to check, if the length of any element is 4
	 */
	
	public static boolean ifAnyLengthFour(List<String> l) {
		return l.stream().anyMatch(t->t.length()==4);//true
	}
	
	/*
	 9)Functional Programming
	 Create a method to check, if no element has length 11
	 */
	public static boolean nonElementLengthEleven(List<String> l) {
		return l.stream().noneMatch(t->t.length()==11);
	}
	
	
	
	
	

}
