package TypeCastingDemos;

public class TypeCastingDemoTwo {

	
	public static void main(String[] args) {
	
		double num = 100.50;
		System.out.println("Num : " + num);
		
		int data = (int)num;	// Explicit TypeCasting (Narrowing Type Casting)
		System.out.println("Data : " + data);
	}
	
}
