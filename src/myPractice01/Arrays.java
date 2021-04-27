package myPractice01;

public class Arrays {

	public static void main(String[] args) {
		//arraysPractice1();
		//arraysPractice2();
	}

	public static void arraysPractice1() {
		
// Write a Java program to calculate the average value of array elements.

        float array1[] = {5, 43, 4, 34, 3};
         
		float sum = 0;
		for(int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println("The average value of the array elements is : " + sum / array1.length);
	}
	
	public static void arraysPractice2() {
	
//Write a Java program to find the common elements between two arrays of integers.
		
		int array1[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int array2[] = {5, 6, 7, 8, 9, 12, 10};
		
		int counter = 0;
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++ ) {
				if(array1[i] == array2[j]) {
					System.out.print(i + " ");
					counter++;
				}
			}
		}
		System.out.println();
		System.out.println("'array1' and 'array2' have " + counter + " common elements.");
	
	}
	
}
