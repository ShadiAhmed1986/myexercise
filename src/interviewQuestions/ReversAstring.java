package interviewQuestions;

public class ReversAstring {

	public static void main(String[] args) {
		
		String str = "This is a normal String !";
		
		String reversed = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println(reversed);

	}

}
