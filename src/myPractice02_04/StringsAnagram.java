package myPractice02_04;

import java.util.Scanner;

public class StringsAnagram {
	
	/*
	   Two strings str1  and str2, are called anagrams 
	   if they contain all the same characters in the same frequencies. 
	   For this challenge, the test is not case-sensitive. 
	   
	   For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
	 */

	public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a string");
        String str=scan.next().toLowerCase();
        System.out.println("please enter second string");
        String str2=scan.next().toLowerCase();
        
	     int total=0;
	     for(int i=0; i<str.length();i++) {
	    	 
	    	 total=total+ str.charAt(i);
	     }
	     
	     System.out.println(total);
	     int total2=0;
	     for(int i=0; i<str2.length();i++) {
	    	 
	    	 total2=total2+ str2.charAt(i);
	     }
	     
	     System.out.println(total2);
	     
         if(total==total2) {
        	 System.out.println("these strings are anagrams");
        	 
         }else {
        	 System.out.println("these strings are not anagrams");
         }		
	}
}
