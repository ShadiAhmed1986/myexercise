package myPractice28_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateElements {
	
	/*
	   Create a list by getting the list elements from user
	   If there is duplicated elements remove them from the list
	 */

	public static void main(String[] args) {
		
		System.out.println("Please enter the length of the list !");
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

		List<Integer> uniqueEl = new ArrayList<>();
		
		for (int j = 0; j < list.size(); j++) {
			for (int k = j+1; k < list.size(); k++) {
				if(list.get(j) != list.get(k) && !uniqueEl.contains(list.get(j) )) {
					uniqueEl.add(list.get(j));
				}
			}
		}
		System.out.println("Duplicated elements removed " + uniqueEl);
		scan.close();
	}

}
