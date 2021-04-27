package myPractice02;

public class Q_06 {
	
	/*
	  Write a function that finds the longest word in a sentence. 
	  If two or more words are found, return the first longest word. 
	  Characters such as apostrophe, comma, 
	  period (and the like) count as part of the word (e.g. O'Connor is 8 characters long).
	 */

	public static void main(String[] args) {
		
		String str = "Write a function that finds the longest word in a sentence.";
		
		String maxlength = "";
		
		String arr[] = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() > maxlength.length()) {
				maxlength = arr[i];
			}
		}
		System.out.println(maxlength);
	}

}
