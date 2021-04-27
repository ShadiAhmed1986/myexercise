package myPractice23_03;

public class InvalidEmailIdUnCheckedException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidEmailIdUnCheckedException(String message) {
		super(message);
	}
}
