package myPractice05_04;

import java.util.stream.IntStream;

public class LambdaForLoops {

	public static void main(String[] args) {
		
		printOneToTwenty(1,20);
		System.out.println();
		System.out.println(findSum(3,98));
		System.out.println(findSumOfEven(3,98));
		System.out.println(prodOfOdd(3,8));
		System.out.println(findFactorial(9));
		System.out.println(prodOfFirstSevenEven(7));
		System.out.println(sumOfFirst(23));
		System.out.println(profOfFirstGreaterThan(5));
	}
	
	/*
	   Print all integers from 1 to 20, without using any loop
	 */

	public static void printOneToTwenty(int starting, int ending) {
		IntStream.rangeClosed(starting, ending).forEach(t->System.out.print(t + " "));
	}
	
	/*
	  Find the sum of integers from 3 to 98 by using Functional Programming
	 */
	public static int findSum(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).sum();
	}
	
	/*
	  Find the sum of even integers from 3 to 98 by using Functional Programming
	 */
	public static int findSumOfEven(int starting, int ending) {
		return IntStream
					.rangeClosed(starting, ending)
						.filter(t->t%2==0).sum();
	}
	
	//Find the multiplication of the odd integers from 3 to 8
	public static int prodOfOdd(int starting, int ending) {
		return IntStream
					.rangeClosed(starting, ending)
						.filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);
	}
	
	//Find 9! by using functioanl programming (9! = 1*2*3....9)
	public static int findFactorial(int num) {
		return IntStream
					.rangeClosed(1, num)
						.reduce(1, Math::multiplyExact);
	}
	
	//Find the multiplication of first 7 even counting numbers (2,4,6,8,10,12,14)
	public static int prodOfFirstSevenEven(int num) {
		return IntStream.iterate(2, t->t+2).limit(num).reduce(1, Math::multiplyExact);
	}
	
	//Find the sum of first 23 odd counting numbers
	public static int sumOfFirst(int num) {
		return IntStream.iterate(1, t->t+2).limit(num).sum();
	}
	
	//Find the multiplication of first 5 odd counting numbers which are greater than 6
	public static int profOfFirstGreaterThan(int num) {
		return IntStream.iterate(7, t->t+2).limit(num).reduce(1, Math::multiplyExact);
	}
}
