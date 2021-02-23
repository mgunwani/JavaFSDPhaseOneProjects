package finalKeywordDemo;

class Calculator {
	
	// Final Variable
	final int count = 100;
	// Blank Final Variable
	final int anotherCount;
	// Static Final Variable
	static final int moreCount = 23;
	// Blank Static Final Variable
	static final int newCount;
	
	public Calculator() {
		this.anotherCount = 200;
	}
	
	static {
		newCount = 700;
	}
	
	void display() {
		// this.count = 200;
		// Final Variable means the value can't be modified in future.
		System.out.println("Count Value : " + this.count);
		System.out.println("Count Value : " + this.anotherCount);
		System.out.println("Count Value : " + Calculator.moreCount);
		System.out.println("Count Value : " + Calculator.newCount);
	}
	
}

public class FinalVariableExample {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.display();
	}
}
