package myPractice01;

public class Strings {

	public static void main(String[] args) {
		/*
		There is a String 's' , of lowercase English letters that is repeated infinitely many times.
		Given an integer 'n',  
		find and print the number of letter 'a's in the first 'n' letters of the infinite string.
		*/
		String str = "asddghasdagshasdsasaaajk";
		int interval = 10;
		
		System.out.println("The letter 'a' is repeated " + findHowManyTimes(str, interval) + " times");
	}
	
	public static int findHowManyTimes(String s , int n) {
		int counter = 0;
		for (int i = 0; i <= n; i++) {
			if(s.charAt(i) == 'a') {
				counter++;
			}
		}
		return counter;
	}

}
