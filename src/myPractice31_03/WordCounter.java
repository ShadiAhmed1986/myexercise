package myPractice31_03;

import java.util.Arrays;

public class WordCounter {
	
	/*
	  Count the words in a String one by one
	  
	  For Example:
	  Input #
	  String is "Ali came to school and Ayse came to school"
	  
	  Output #
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */

	public static void main(String[] args) {
		
		String str = "Ali came to school and Ayse came to school";
		
		String arr[] = str.split(" ");
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int counter = 1;
		for (int i = 0 ; i < arr.length-1; i++) {
			if(arr[i].equals(arr[i+1])) {
				counter++;
			}else {
				System.out.println(arr[i] + "=" + counter);
				counter = 1;
			}
			if(i==arr.length-2) {
				System.out.print(arr[i+1]+"="+counter);
			}
		}
	}

}
