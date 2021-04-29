package myPractice29_04;

public class CountLetters {
	
	/*
	Create a method like:
	"aaabbccccd" ===> a3b2c4d1
	 */
	
	public static void main(String[] args) {
		
		String str = "baaabbccccd";
		int counter = 1;
		
		String newStr = "";
		//char ch;
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i - 1)) {
				counter++;
				
			}else {
				newStr = newStr + str.charAt(i-1) + counter;
				counter = 1;
			}
			if(i == str.length()-1) {
				newStr = newStr + str.charAt(i) + 1;
			}
			
		}
		System.out.println(newStr);
	}
}

	
	
