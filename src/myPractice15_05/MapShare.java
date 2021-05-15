package myPractice15_05;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
	
	/*
	  	Modify and return the given map as follows: 
	  	
	  	if the key "a" has a value, 
	  	set the key "b" to have that same value. 
	  	In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	 */

	public static void main(String[] args) {
		
		Map<String, String> myMap = new HashMap<>();
		myMap.put("a", "aaa");
		myMap.put("b", "bbb");
		myMap.put("c", "ccc");
		myMap.put("d", "ddd");

		System.out.println(mapShare(myMap));;
	}
	
	public static Map<String, String> mapShare(Map<String, String> myMap) {
		
		
		if(myMap.containsKey("a")) {
			myMap.put("a", myMap.get("a"));
			myMap.put("b", myMap.get("a"));
			myMap.remove("c");
		}else {
			myMap.remove("c");
		}
	
		return myMap;
		  
	}

}
