package myPractice05_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaWithMethodsReferenceInt {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
	    l.add(12);
	    l.add(9);
	    l.add(13);
	    l.add(4);
	    l.add(9);
	    l.add(2);
	    l.add(4);
	    l.add(12);
	    l.add(7);

	    printEven(l);
	    System.out.println("=======");
	    printSquareOfOdd(l);
	    System.out.println("=======");
	    System.out.println(sumOfSqOfEven(l));
	    System.out.println("=======");
	    System.out.println(prodOfCubesOdd(l));
	    System.out.println("=======");
	}
	
	/*
 	1)Functional Programming
 	Create a method to print the even list elements on the console in the same line 
    with a space between two consecutive elements.
	 */

	public static void printEven(List<Integer> l) {
		l.stream().filter(Utils::checkToBeEven).forEach(System.out::println);
	}
	
	/*
 	2)Functional Programming
 	Create a method to print the square of odd list elements on the console in the same line 
    with a space between two consecutive elements.
	 */
	public static void printSquareOfOdd(List<Integer> l) {
		l.stream().filter(Utils::checkToBeOdd).map(Utils::findSquare).forEach(System.out::println);
	}
	
	/*
 	3)Functional Programming
 	Create a method to calculate the sum of the squares of distinct even elements
	 */
	public static int sumOfSqOfEven(List<Integer> l) {
		return l.stream()
					.filter(Utils::checkToBeEven)
						.distinct().map(Utils::findSquare)
							.reduce(0, Math::addExact);
	}
	
	/*
 	4)Functional Programming
 	Create a method to calculate the product of the cubes of distinct odd elements
	 */
	public static int prodOfCubesOdd(List<Integer> l) {
		return l.stream()
					.filter(Utils::checkToBeOdd)
						.distinct().map(Utils::findCube).reduce(1, Math::multiplyExact);
	}
	
	
}
