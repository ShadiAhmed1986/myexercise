package myPractice17_05;

import java.util.ArrayList;
import java.util.List;

public class ReviewLambdaWithMethodReferencesInt {

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
	    
	    printEvenEl(l);
	    System.out.println();
	    printSquareofOdd(l);
	    System.out.println();
	    System.out.println(sumOfSqOfDistinctOdd(l));
	    System.out.println();
	    System.out.println(prodOfCubesOfDistinctOdd(l));

	}
	
	/*
 	1)Functional Programming
 	Create a method to print the even list elements on the console in the same line 
    with a space between two consecutive elements.
    
    Note: Method Reference ==>> Class Name :: Method Name
	 */
	
	public static void printEvenEl(List<Integer> l) {
		l.stream().filter(Utils::checkToBeEven).forEach(t->System.out.print(t + " "));
	}
	
	/*
 	2)Functional Programming
 	Create a method to print the square of odd list elements on the console in the same line 
    with a space between two consecutive elements.
	 */
	public static void printSquareofOdd(List<Integer> l) {
		l.stream().filter(Utils::checkToBeOdd).map(Utils::findSquare).forEach(t->System.out.print(t + " "));
	}

	/*
 	3)Functional Programming
 	Create a method to calculate the sum of the squares of distinct even elements
	 */
	public static int sumOfSqOfDistinctOdd(List<Integer> l) {
		return l.stream().filter(Utils::checkToBeEven).distinct().map(Utils::findSquare).reduce(0,Math::addExact);
	}
	
	/*
 	4)Functional Programming
 	Create a method to calculate the product of the cubes of distinct odd elements
	 */
	public static int prodOfCubesOfDistinctOdd(List<Integer> l) {
		return l.stream().filter(Utils::checkToBeOdd).distinct().map(Utils::findCube).reduce(1, Math::multiplyExact);
	}
}
