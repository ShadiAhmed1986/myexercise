package myPractice15_05;

import java.util.HashMap;
import java.util.Map;

public class MapAB {
	
	/*
	 	Modify and return the given map as follows: 
	 	Map may or may not contain the "a" and "b" keys. 
	 	If both keys are present, 
	 	append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
	 */

	public static void main(String[] args) {
		
		Map<String, String> myMap = new HashMap<>();
		myMap.put("a", "Hi");
		myMap.put("b", "There");
		
		System.out.println(mapAB(myMap));
	}
	
	public static Map<String, String> mapAB(Map<String, String> map) {
		  
		if(map.containsKey("a") && map.containsKey("b")) {
			String word = map.get("a") + map.get("b");
			map.put("ab",word);
		}
		
		return map;
	}

}
