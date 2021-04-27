package myPractice17_03;

import java.util.Arrays;

public class PrintNameASChar {

	public static void main(String[] args) {
		
		/* Create a custom return type method accepts a name as parameter
	     * and prints the name as a char array
		 *
		 * (do not use toCharArray() method)
		 *
		   Input  : John
		   Output : [J, o, h, n]
		 */

		String input = "John";
		
		charArray(input);
		
	}
	public static void charArray(String str) {
		
		char arr[] = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
