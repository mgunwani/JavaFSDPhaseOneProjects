package exceptionHandling;

class ValidateAgeException extends Exception {
	private static final long serialVersionUID = 1L;
	public ValidateAgeException() {
		super("Age is not valid to vote.");
	}
}

public class ExceptionDemoSix {
	
	static void validate(int age) throws ValidateAgeException {
		if(age < 18) {
			throw new ValidateAgeException();
		} else {
			System.out.println("Age is valid to vote.");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(13);
		} catch(ValidateAgeException ex) {
			System.out.println("Exception : " + ex.getMessage());
		}			
	}

}
