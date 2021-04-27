package myPractice26_03_Forth;

import java.util.Scanner;

public class DetectPangram {
	
	/*
	   A pangram is a sentence that contains every single letter of the alphabet at least once. 
	   For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, 
	   because it uses the letters A-Z at least once (case is irrelevant).

       Given a string, detect whether or not it is a pangram. 
       Return True if it is, False if not. Ignore numbers and punctuation.
	 */

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence !");
		String str = scan.nextLine().toLowerCase();
		//String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(pangram(str));	
		
		scan.close();
	}
	
	public static boolean pangram(String s) {
		
		int count=0;
	    for(char i = 'a'; i <= 'z'; i++) {
	    	if(!(s.contains(String.valueOf(i)))) {
	    		count++;
	    	}
	    }
	    
	    System.out.println(count);
		  if(count>=1) {
			  return false;
		  }else {
			  return true;
		  }
		  
		  
	}
}
