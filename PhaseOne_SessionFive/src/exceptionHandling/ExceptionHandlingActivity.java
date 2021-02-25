package exceptionHandling;

import java.util.Scanner;

/*
 * creating our custom exception
 */
class PriceException extends Exception {
	private static final long serialVersionUID = 1L;

	public PriceException() {
		super("Its not a valid Price");
	}
}

public class ExceptionHandlingActivity {

	static void pricing(int cp, int sp) throws PriceException {
		if (((cp == 0) || (sp == 0)) || ((cp < 0) || (sp < 0))) {
			throw new PriceException();
		} else {
			if(sp > cp)
				System.out.println("Profit Made");
			else if( cp> sp) 
				System.out.println("Loss Made");
			else
				System.out.println("No Profit No Loss");
		}
	}

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter CP");
			int cp = scan.nextInt();
			System.out.println("Enter SP");
			int sp = scan.nextInt();
			pricing(cp, sp);
		} catch (PriceException ex) {
			System.out.println("Exception to Enter New Price : " + ex.getMessage());
		}
	}
}