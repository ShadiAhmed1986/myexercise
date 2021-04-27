package myPractice05_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaWithInt {

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
	    l.add(15);

	    evenElements(l);
	    System.out.println();
	    printOddElements(l);
	    System.out.println();
	    cubeOfDistinctOdd(l);
	    System.out.println();
	    System.out.println(sumOfSquaresOfDistinctEven(l));
	    System.out.println(prodOfCubesOfOdd(l));
	    System.out.println( maxElement(l));
	    System.out.println(minElement(l));
	    
	    
	}
	
	/*
 	2)Functional Programming
 	Create a method to print the even list elements on the console in the same line 
    with a space between two consecutive elements.
	 */
	
	public static void evenElements(List<Integer> l) {
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t+ " "));
	}
	
	/*
 	3)Functional Programming
 	Create a method to print the square of odd list elements on the console in the same line 
    with a space between two consecutive elements.
	 */
	public static void printOddElements(List<Integer> l) {
		l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t + " "));
	}
	
	/*
 	4)Functional Programming
 	Create a method to print the cube of distinct odd list elements on the console in the same line 
    with a space between two consecutive elements.
	 */
	public static void cubeOfDistinctOdd(List<Integer> l) {
		l.stream()
			.filter(t->t%2!=0)
				.distinct()
					.map(t->t*t*t).forEach(t->System.out.print(t + " "));
	}
	
	/*
 	5)Functional Programming
 	Create a method to calculate the sum of the squares of distinct even elements
	 */
	public static int sumOfSquaresOfDistinctEven(List<Integer> l) {
		return l.stream()
					.filter(t->t%2==0)
						.distinct().map(t->t*t).reduce(0, (x,y)->x+y);
	}
	
	/*
 	6)Functional Programming
 	Create a method to calculate the product of the cubes of distinct odd elements
	 */
	public static int prodOfCubesOfOdd(List<Integer> l) {
		return l.stream()
					.distinct()
						.filter(t->t%2!=0)					
							.map(t->t*t*t).reduce(1, (x,y)->x*y);
	}
	
	/*
 	6)Functional Programming
 	Create a method to calculate the max element in the list
	 */
	public static Optional<Integer> maxElement(List<Integer> l) {
		return l.stream().reduce((x, y)->x>y ? x : y);
	}
	
	/*
 	7)Functional Programming
 	Create a method to calculate the min element in the list
	 */
	public static Optional<Integer> minElement(List<Integer> l){
		return l.stream().reduce((x,y)->x<y ? x : y);
	}
	
	
	
}
