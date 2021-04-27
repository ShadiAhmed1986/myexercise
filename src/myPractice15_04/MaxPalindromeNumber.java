package myPractice15_04;

public class MaxPalindromeNumber {
	
	/*
     * A palindromic number reads the same both ways.
     * The largest palindrome made from the product of two 2-digit numbers is
     *   9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     * like 654*671 = 438834
 */


	public static void main(String[] args) {
		
		
		int maxNum = 1;
		int maxNum1 = 1;
		int maxNum2 = 1;
		
		for (int i = 999; i > 100; i--) {
			for(int j = 999; j > 100; j--) {
				if(checkIfPalindrome(i*j)) {
					if(maxNum < i*j) {
						maxNum = i*j;
						maxNum1 = i;
						maxNum2 =j;
					}
				}
			}
		}
		System.out.println("Max palindrome number= "+maxNum1+"*"+maxNum2+"="+maxNum);
	}

	public static boolean checkIfPalindrome(int x) {
		boolean result=false;
		int temp =x;
		
		int digit1=temp%10;
		temp/=10;
		int digit2=temp%10;
		temp/=10;
		int digit3=temp%10;
		temp/=10;
		int digit4=temp%10;
		temp/=10;
		int digit5=temp%10;
		temp/=10;
		int digit6=temp%10;
		temp/=10;
		
		if(digit1==digit6 && digit2==digit5 && digit3==digit4) {
			result=true;
		}
		return result;
		
	}
}

