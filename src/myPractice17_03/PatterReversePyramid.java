package myPractice17_03;

public class PatterReversePyramid {
	
	/*
	* Create the following pattern
	
	Enter the number of rows:
	5
	* * * * *
	 * * * *
	  * * *
	   * *
	    *
*/

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = row; k > i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
