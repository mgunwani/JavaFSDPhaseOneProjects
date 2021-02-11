package TypeCastingDemos;

public class TypeCastingDemoThree {

	
	public static void main(String[] args) {
		
		/*
		int num1 = 100;
		int num2 = 200;
		byte num3 = (byte)(num1 + num2);
		System.out.println("Number One : " + num1);
		System.out.println("Number Two : " + num2);
		System.out.println("Number Three : " + num3);
		*/
		
		byte num1 = 100;
		byte num2 = 20;
		// int num3 =  num1 + num2;
		byte num3 = (byte)(num1 + num2);
		System.out.println("Number One : " + num1);
		System.out.println("Number Two : " + num2);
		System.out.println("Number Three : " + num3);
		
		/**
		 * byte, short and char gets converted into int after any calculation.
		 */
		
	}
	
}
