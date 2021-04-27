package myPractice23_03;

public class ReviewInterviewQ03 {
	
	/*
	   Create a method like:
	   "aaabbccccd" ===> a3b2c4d1
	 */

	public static void main(String[] args) {
		
		String str = "aaabbccccd";
		
		System.out.println(countLetters(str));
	}

	public static String countLetters(String s) {
		
		String result = "";
		
		int counter = 1;
		
		for (int i = 1; i < s.length(); i++) {
			if(s.substring(i-1, i).equals(s.substring(i, i+1))) {
				counter++;
			}else {
				result += s.substring(i-1, i) + counter;
				counter = 1;
			}
		}
		return result;
	}
}
