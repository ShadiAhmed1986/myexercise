package myPractice01_05;

import java.util.Arrays;
import java.util.HashMap;

public class CountVowels {
	
	/*   ======== Interview Question =========
	 Ask user to enter a String and count the vowels(a,e,i,o,u) contained in the String
	 AliCan ==> The number of a = 2
	            The number of i = 1            
	 */

	public static void main(String[] args) {
		
		String str = "alican";

		System.out.println(getNumOfChars(str));
	}
	
	public static HashMap<String, Integer>getNumOfChars(String str){
		
		  HashMap<String, Integer>map=new HashMap<>();
		  
		  String arr[]=str.toLowerCase().split("");
		  
		  System.out.println(Arrays.toString(arr));
     
       for(String w: arr) {
      	 if(w.equals("a") || w.equals("o") ||w.equals("e") ||w.equals("i") ||w.equals("u") ) {
      		 if(!map.containsKey(w)) {
      		 map.put(w,1);
      	 }else {
      		 map.put(w, map.get(w)+1);
      	 }	 
      	 } 
       }return map;
	}	
}
