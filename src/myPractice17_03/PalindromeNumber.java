package myPractice17_03;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number:");
		int num=scan.nextInt();
		
		int sum = 0;
		int k = 0;
		int num2 = num;
		
		while(num > 0) {
			k = num % 10;
			sum = sum * 10 + k;
			num = num / 10;
		}System.out.println(sum);
		
	   if(sum == num2) {
		   System.out.println("they are palindrome");
	   }else {
		   System.out.println("they are not a palindrome");
	   }
	   
	   scan.close();
	}

}
