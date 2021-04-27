package myPractice01_04;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: 
For example : a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
*/

public class HighestScoreKubraHoca1 {
	
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String please");
        String s = scan.nextLine().toLowerCase();
        
        String  words []= s.split(" ");
        System.out.println(Arrays.toString(words));
        
        int scorewords [] = new int [words.length];
        
        for(int i=0 ; i< words.length ; i++) {
            for(int j=0 ;j<words[i].length() ;j++) {
                if(words[i].charAt(j)>='a' && words[i].charAt(j)<='z')
                scorewords[i]+=words[i].charAt(j) -'a' +1;
                System.out.println(Arrays.toString(scorewords));
            }
        }
        
        System.out.println(Arrays.toString(scorewords));
        
        int theHighestScore = 0;
        
        for(int each :scorewords) {
            if(theHighestScore < each) {
            	theHighestScore=each;
           }
        }
        System.out.println(theHighestScore);
        
        for(int i=0; i<scorewords.length; i++) {
            if(theHighestScore==scorewords[i]) {
                System.out.println(words[i]);
                break;
            }
        }
    }

}
