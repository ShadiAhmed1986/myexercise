package myPractice28_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElements {
	
	/*
	  Ask user to enter elements into a list and
	  find the common elements in the list and print them without repeating
	  
	  list=[1, 1, 3, 4, 5] 
	 */

	public static void main(String[] args) {
		
		System.out.println("Please enter the length oof the list !");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		int i = 0;
		do {
			System.out.println("Enter an element");
			list.add(scan.nextInt());
			i++;
		}while(i < length);
		System.out.println(list);
		
		List<Integer> commonEl = new ArrayList<>();
		
		for (int j = 0; j < list.size(); j++) {
			for (int k = j+1; k < list.size(); k++) {
				if(list.get(j) == list.get(k) && !commonEl.contains(list.get(j))) {
					commonEl.add(list.get(j));
				}
			}
		}		
		System.out.println("Common elements : " + commonEl);
		scan.close();
	}
}
