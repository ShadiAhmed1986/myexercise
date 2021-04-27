package myPractice17_03;

public class AvrValueOfArrayElements {

	public static void main(String[] args) {
		
		/*
		   * Write a java program that calculates the average value of array elements
       *
       * input[]= {1,2,3,4,5,6,7}
       * Output : 4

		 */
		
		int input[]= {1,2,3,4,5,6,7};
		
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		int avr = sum / input.length;
		System.out.println("The average of the Array's elements is : "+avr);
	}

}
