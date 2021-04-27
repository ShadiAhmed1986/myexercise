package myPractice01;

public class JustPractice {

	public static void main(String[] args) {
		question1();
	}
	
	public static void question1() {
		
		/* 
		 Add these two String numbers String conversion:
				String s1 = "$12.99";
				String s2 = "$5.00";
		*/
		
		String s1 = "$12.99";
		String s2 = "$5.00";
		
		String str1 = s1.replace("$", "");
		String str2 = s2.replace("$", "");
		
		Float total = Float.valueOf(str1) + Float.valueOf(str2);
		
		
		System.out.println("The total of " + s1 + " and " + s2 + " is : " + "$" + total);
	}
	
	
}
