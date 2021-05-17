package myPractice17_05;

import java.util.stream.IntStream;

public class ReviewLambdaForForLoop {

	public static void main(String[] args) {
		
		printOneToHundred(1,10);
		System.out.println();
		System.out.println(printSum(3,98));
		System.out.println();
		System.out.println(printSumOfEvenInt(3,98));
	}
	
	/*
	   Print all integers from 1 to 100, without using any loop
	 */
	public static void printOneToHundred(int starting, int ending) {
		
		IntStream.rangeClosed(starting, ending).forEach(t->System.out.print(t + " "));
	}
	
	/*
	  Find the sum of integers from 3 to 98 by using Functional Programming
	 */
	public static int printSum(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).sum();
	}
	
	/*
	  Find the sum of even integers from 3 to 98 by using Functional Programming
	 */
	public static int printSumOfEvenInt(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).filter(t-> t % 2 == 0).sum();
	}

}
