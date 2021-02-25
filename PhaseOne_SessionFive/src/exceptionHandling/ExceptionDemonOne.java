package exceptionHandling;

import java.util.Scanner;

/*
 * Unchecked Exception
 */


public class ExceptionDemonOne {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second Number : ");
		int num2 = scanner.nextInt();
		
//		float result = 0;
//		try {
//			result = num1/num2;	
//		} catch(Exception ex) {
//			System.out.println("Cannot perform division as Divisor is Zero!!");
//		}
		float result = num1/num2;
		System.out.println("Result : " + result);
		
	}
	
}
