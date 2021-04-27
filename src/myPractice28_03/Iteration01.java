package myPractice28_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iteration01 {
	
	/*
	   Write a program that deletes those with the letter 'a' or ‘A’ in it. 
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} 
     * OUTPUT : [Veli,Omer]
	 */

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		System.out.println(list1);
		
		ListIterator<String> it1 = list1.listIterator();
		
		while(it1.hasNext()) {
			String el = it1.next();
			if(el.contains("a") || el.contains("A")) {
				it1.remove();
			}
		}
		System.out.println(list1);

	}

}
