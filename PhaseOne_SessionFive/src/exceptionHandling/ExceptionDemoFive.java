package exceptionHandling;

public class ExceptionDemoFive {

	public static void main(String[] args) {
	
		int num1 = 20, num2 = 10;
		
		try {
			System.out.println(num1/num2);
			System.out.println("Remaining Code in Try Block Here..");
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Finally will always execute..");
		}
		System.out.println("Remaining code after Exception Handling here..");
		
	}
	
}
