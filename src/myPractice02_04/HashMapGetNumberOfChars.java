package myPractice02_04;

import java.util.HashMap;

public class HashMapGetNumberOfChars {
	
	/*
	   Create a method which return the number of every character which is used in a String
	 	Example: Hellooo ==> H=1, e=1, l=2, o=3
	 */

	public static void main(String[] args) {
		
		String str = "Hellooo";
		
		System.out.println(getNumOfChars(str));
	}
	

	public static HashMap<String, Integer> getNumOfChars(String str){
		
		String arr[] = str.split("");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String w : arr) {
			if(!hm.containsKey(w)) {
				hm.put(w, 1);
			}else {
				hm.put(w, hm.get(w)+1);
			}
		}
		
		return hm;
		
	}
}
