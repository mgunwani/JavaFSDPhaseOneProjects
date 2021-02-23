package constructorChainingDemo;

/**
 * 
 * @author BhawnaGunwani
 *
 *	Constructor Chaining using 'this' Keyword.
 *	Demonstrating: Constructor Overloading
 */

class Demo {
	int number;
	public Demo() {
		this.number = 100;
		System.out.println("Default Constructor..");
	}
	public Demo(int num) {
		this();
		this.number = num;
		System.out.println("Parameterized Constructor with One Param..");
	}
	public Demo(int num1, int num2) {
		this(100);
		this.number = num1;
		System.out.println("Parameterized Constructor with Two Params..");
	}
}

public class ConstructorChainingDemoOne {
	public static void main(String[] args) {	
		Demo obj = new Demo(1000, 200);
		System.out.println(obj.number);
	}
}
