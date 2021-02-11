package TypeCastingDemos;

public class TypeCastingDemoFour {
	
	public static void main(String[] args) {
		
		// Type Conversion from String to int
		// String data = "100";
		// System.out.println("String Value : " + data);
		// int number = Integer.parseInt(data);
		// System.out.println("Integer Value : " + number);
		
		
		// Type Cast from int to String
		int number = 100;
		System.out.println("Integer Value : " + number);
		String data = String.valueOf(number);
		System.out.println("String Value : " + data);
	}

}
