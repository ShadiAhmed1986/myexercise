package myPractice02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Q_01 {

	public static void main(String[] args) {
		
		/*
		  Given a string, s , and an integer, num, 
		  complete the function so that it finds 
		  the lexicographically smallest and largest substrings of length num.
		 */
		
		String s = "welcometojava";
		int num = 3;
		
        List<String> list = new ArrayList<>();
		
		for(int i = 0; i < s.length()-num+1; i++) {
			list.add(s.substring(i, num+i));
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
