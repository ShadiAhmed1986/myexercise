package myPractice15_05;

import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
	
	/*
	 	Modify and return the given map as follows: 
	 	if exactly one of the keys "a" or "b" has a value in the map (but not both), 
	 	set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
	 */

	public static void main(String[] args) {
		
		Map<String,String> myMap = new HashMap<>();
		myMap.put("a", "aaa");
		myMap.put("b", "bbb");
		myMap.put("c", "cake");
		
		System.out.println(mapAB3(myMap));
	}
	
	public static Map<String, String> mapAB3(Map<String, String> map) {
		
		if(map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		}else if(!map.containsKey("a") && map.containsKey("b")) {
			map.put("a", map.get("b"));
		}
		
		return map;
	}

}
