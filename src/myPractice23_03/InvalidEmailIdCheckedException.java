package myPractice23_03;

public class InvalidEmailIdCheckedException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidEmailIdCheckedException(String message) {
		super(message);
	}
}
