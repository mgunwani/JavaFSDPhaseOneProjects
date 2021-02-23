package constructorChainingDemo;

/**
 * 
 * @author BhawnaGunwani
 *
 *	Constructor Chaining using 'super' keyword.
 *
 */

class Base {
	Base() {
		System.out.println("Base Class - Default Constructor");
	}
	Base(int num) {
		this();
		System.out.println("Base Class - Parameterized Constructor");
	}
}
class Derived extends Base {
	Derived() {
		super(100);
		System.out.println("Derived Class - Default Constructor");
	}
	Derived(int num) {
		this();
		System.out.println("Derived Class - Parameterized Constructor");
	}
}

public class ConstructorChainingDemoTwo {
	public static void main(String[] args) {
		Derived obj = new Derived(100);
	}	
}
