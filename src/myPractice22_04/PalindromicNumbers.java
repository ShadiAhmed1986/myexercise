package myPractice22_04;

public class PalindromicNumbers {
	
	/*
	   arr[]={123, 343,567,987, 54, 44} , 
	   bu arraydaki palinromic  olan sayilari tek tek console yazdiralim, 
	   palindrome sayi , reverse yazilisi kendine esit olan sayi ,ornegin 343, 44 gibi .
	   Bu arada arraydaki sayilarin digitleri farkli olacagi icin, 
	   int numDigits = String.valueOf(number).length(); methodunu kullanip , 
	   verilen bir sayinin kac digit oldugunu bulup, loop u buna gore dondurebilirsiniz. 
	 */

	public static void main(String[] args) {
		
		int arr[]={123, 343,567,987, 54, 44, 2332};
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num == reversedNum(num)) {
				System.out.print(num + " ");
			}
		}
	}
	
	public static int reversedNum(int num) {
		
		int reversed = 0;
		int numDigits = String.valueOf(num).length();
		for(int i = 0; i < numDigits; i++) {
			int remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num = num /10;
		}
		return reversed;	
	}
}
