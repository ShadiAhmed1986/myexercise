package myPractice28_04;


public class StrongestPair {
	
	/*We are organising a horse race with horses having distinct strengths.
 	  The strength of the horses are represented by an array of integers.
 	  In order to make the race competitive, your program should find out
 	  the pair of horses with similar strengths:
 	
     For example: {3, 67, 9, 46, 55, 48}
     Output#
     46, 48*/

	public static void main(String[] args) {
		
		int arr[] = {3, 67, 9, 46, 55, 48};
		
		int diff = Integer.MAX_VALUE;
		int num1 = 0;
		int num2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] - arr[j] < diff) {
					diff = Math.abs(arr[i] - arr[j]);
					num1 = arr[i];
					num2 = arr[j];
				}
			}
		}
		System.out.println("Similar pair: " + num1 + " and " + num2);
		System.out.println("Difference: " + diff);
	}
}
