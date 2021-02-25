package exceptionHandling;

class ArithmeticTest1 {
	
	public static void calculate() {
		int arr[] = {10,20,30,40,50};
		int num1 = 50, num2 = 10;
		try {
			System.out.println(num1/num2);
			System.out.println("4th Element : " + arr[3]);
			System.out.println("5th Element : " + arr[5]);
		} catch(ArithmeticException | IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}
}


public class ExceptionDemoFour {
	
	public static void main(String[] args) {
		ArithmeticTest1.calculate();
	}

}
