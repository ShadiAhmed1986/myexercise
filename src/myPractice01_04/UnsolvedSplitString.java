package myPractice01_04;

public class UnsolvedSplitString {
	
	/*
	   Complete the solution so that it splits the string into pairs of two characters. 
	   If the string contains an odd number of characters, 
	   then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
	 */

	public static void main(String[] args) {
		
		String str = "abcdef";
		int length;
		if (str.length() % 2 == 0) {
			length = str.length() / 2;
		}else {
			length = (str.length() / 2) + 1;
		}
		
		String arr [] = new String[length];
		
		for (int i = 0; i < str.length(); i= i + 2) {
			
		}
	}
	
//	public static String[] solution(String s) {
//        
//		
//    }

}
