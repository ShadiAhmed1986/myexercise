package myPractice19_03;

public class Pattern {
	
	/*
	 1)Ask user to enter a positive integer
	 2)Create and print the following image on the console
						       *
						      * *
						     * * *
						    * * * *
						       .
						       .
						       .
*/

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 0; i < row; i++) {
			for (int k = i; k < row; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
