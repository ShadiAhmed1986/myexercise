package myPractice27_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DescendingOrder {
	
	/*
	   Your task is to make a function that can take any non-negative integer as an argument 
	   and return it with its digits in descending order. 
	   Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a multiple digit number !");
		int num = scan.nextInt();
	
		List<Integer> list = new ArrayList<>();
		
		while(num > 0) {
			list.add(num % 10);
			num = num /10;
		}
		
		
		System.out.println(list);
		
		Collections.sort(list);
	    Collections.reverse(list);
	    System.out.println(list);
	    
	    for(int w: list) {
	    	 System.out.print(w); 
	    }
	    
	    scan.close();
     }
}
