package myPractice30_04;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	 /*
     * Write a method which accepts an integer as parameter
     * and returns “true” if it is a Fibonacci number
     *
     * Then check the result and print
     * “Fibonacci series contain your number” or
     * “Fibonacci series contain that numbers : X and Y”
     * (X and Y should be the closest Fibonacci numbers to given number X<num<Y)
     */

	static boolean fibo;
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		
		int input = 19;
		
		checkFibo(input);
		
		if(fibo) {
			System.out.println("The number is fibonacci number");
		}else {
			System.out.println("The number is between " + num1 + " and " + num2);
		}
		
	}

	public static void checkFibo(int input) {
	
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		
		for (int i = 2; i <= input; i++) {
			list.add(list.get(i-2) + list.get(i-1));
			if(list.get(i) >= input){
				break;
			}		
		}
		if(list.get(list.size()-1) == input) {
			fibo = true;
		}else {
			fibo=false;
		}
		num1 = list.get(list.size()-2);
		num2 = list.get(list.size()-1);
		
	}
}
