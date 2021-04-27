package myPractice02_04;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSetGetElementByIndex {
	
	/*
	   Try to print elements at index 2 on the console
	 */

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(45);
		lhs.add(5);
		lhs.add(9);
		lhs.add(98);
		
		System.out.println(get(lhs));

	}

	public static String get(LinkedHashSet<Integer> lhs) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an index number !");
		int num = scan.nextInt();
		scan.close();
		
		int idx = 0;
		Iterator<Integer> it = lhs.iterator();
		while(it.hasNext()) {
			Integer el = it.next();
			if(idx == num) {
				return "The element on index " + idx + " is " + el;
			}
			idx++;
		}
		return "No such element";
	}

	
}
