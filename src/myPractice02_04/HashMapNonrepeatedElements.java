package myPractice02_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapNonrepeatedElements {
	
	/*
	   Create a method to return non-repeated elements from a list
	    Example: Hellooo ==> [H, e]
	 */

	public static void main(String[] args) {
		
		String str = "Hellooo";
		System.out.println(getNonrepeatedElements(str));
		
	}
	
	public static List<String> getNonrepeatedElements(String str){
		
		List<String> list = new ArrayList<>();
		
		String arr[] = str.split("");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String w : arr) {
			hm.computeIfPresent(w, (key, value)->value+1);
			hm.computeIfAbsent(w, k->1);
		}
		
		for (Entry<String, Integer> w : hm.entrySet()) {
			if(w.getValue()==1) {
				list.add(w.getKey());
			}
		}
		
		
		return list;
		
	}

}
