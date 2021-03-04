package stack_demos;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		System.out.println(stack);
		System.out.println("Element Popped out is : " + stack.pop());
		System.out.println("Element Ready to Pop out is : " + stack.peek());
		System.out.println(stack.isEmpty()?"Empty": "Not Empty");
		System.out.println(stack);
	}
	
	
}
