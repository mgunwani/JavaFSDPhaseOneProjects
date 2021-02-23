package polymorphismdemo;

/**
 * 
 * @author BhawnaGunwani
 *
 *	Demonstrating `Method Overloading`
 */

class Calculator {

	// `Addition` method with 2 integer Parameters
	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	// `Addition` method with 3 integer Parameters
	public int addition(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	// `Addition` method with 2 float Parameters
	public float addition(float num1, float num2) {
		return num1 + num2;
	}

	// `Addition` method with 1 integer and 1 float Parameters
	public float addition(int num1, float num2) {
		return num1 + num2;
	}

	// `Addition` method with 1 integer and 1 float Parameters
	public float addition(float num2, int num1) {
		return num1 + num2;
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		System.out.println(obj.addition(100, 200, 300));
		System.out.println(obj.addition(100, 200));
		System.out.println(obj.addition(100.75F, 200.30F));
		System.out.println(obj.addition(100, 200.50F));
		System.out.println(obj.addition(100.25F, 1000));
	}

}
