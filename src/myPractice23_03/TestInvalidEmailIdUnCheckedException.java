package myPractice23_03;

public class TestInvalidEmailIdUnCheckedException {

	public static void main(String[] args) {
		
		try {
			validateEmailId("@gmail.com");
		}catch(InvalidEmailIdUnCheckedException  e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void validateEmailId(String email) throws InvalidEmailIdUnCheckedException{
		
		if(email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println("Email succesfully created");
		}else {
			throw new InvalidEmailIdUnCheckedException("Invalid email address");
		}
	}
	
}
