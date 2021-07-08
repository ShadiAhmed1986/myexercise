package myPractice08_07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindRepeatedChars {
	
	/*
	Find the repeated characters in a String.
	*/

	public static void main(String[] args) {
		
		String str = "This is a String";

		findReapeatedChars(str);
	}
	
	public static void findReapeatedChars(String str) {
		
		String arr[] = str.replace(" ", "").split("");
		System.out.println(Arrays.toString(arr));
		
		Map<String, Integer> myMap = new HashMap();
		
		for(String each : arr) {
			if(!myMap.containsKey(each)) {
				myMap.put(each, 1);
			}else {
				myMap.put(each, myMap.get(each)+1);
			}
		}
		for(Entry<String, Integer> w : myMap.entrySet()) {
			if(w.getValue() > 1) {
				System.out.println(w.getKey() + " is repeated " + w.getValue() + " times.");
			}
		}
	}

}
