package myPractice23_03;

public class TestInvalidEmailIdCheckedException {

	public static void main(String[] args) {
		
		try {
			validateEmailId("@gmail.com");
		}catch(InvalidEmailIdCheckedException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public static void validateEmailId(String email) throws InvalidEmailIdCheckedException{
		
		if(email.contains("@gmail.com") || email.contains("@yahoo.com")) {
			System.out.println("Email created");
		}else {
			throw new InvalidEmailIdCheckedException("This is an invalid email");
		}
	}

}
