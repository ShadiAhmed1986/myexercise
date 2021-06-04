package myPractice04_06;

public class Armstorng {
	
	/*
	A number is called an Armstrong Number if it is equal to the sum of the cube of its every digit.
	For example; 153 is an Armstrong Number.
	Because ==>  (1*1*1)+(5*5*5)+(3*3*3) = 153
	You need to write a program to check if the given number is Armstrong number or not.
	*/
	
	public static void main(String[] args) {
		
		int num = 8208;
		checkifArmstrong(num);
		
	}

	public static void checkifArmstrong(int num) {
		
		int num1 = num % 10;
		int temp = num /10;
		int num2 = temp % 10;
		int num3 = (temp / 10);
		
		System.out.println((num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3));
		
		if((num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3) == num) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not armstrong");
		}
	}
}
