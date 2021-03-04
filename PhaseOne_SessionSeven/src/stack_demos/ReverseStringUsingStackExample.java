package stack_demos;

import java.util.Stack;

public class ReverseStringUsingStackExample {

	public static String Reverse(String input) {
		
		Stack<Character> stack = new Stack<Character>();
		
		// for (int i = 0; i < input.length(); i++)
		// 	stack.push(input.charAt(i));
		
		for (char ch : input.toCharArray())
			stack.push(ch);
		
		String reversed = "";
		while(!stack.isEmpty())
			reversed += stack.pop();
			// reversed = reversed + stack.pop();
		
		return reversed;
	}
	
	
	public static void main(String[] args) {
		
		String str = "abcd";
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + Reverse(str));
		
	}
}
