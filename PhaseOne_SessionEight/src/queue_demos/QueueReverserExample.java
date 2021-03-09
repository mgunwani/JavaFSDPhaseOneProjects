package queue_demos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverserExample {
	
	public static void reverse(Queue<Integer> queue, int k) {
		if(k < 0 || k > queue.size()) 
			throw new IllegalArgumentException();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// Dequeue the first elements from Queue and Push them onto the Stack
		for (int i = 0; i < k; i++)
			stack.push(queue.remove());
		
		// Enqueue the content of stack and push back to the queue
		while(!stack.isEmpty())
			queue.add(stack.pop());
		
		// Add the remaining items in the queue
		// (items after the first k elements) to the back of the queue
		// and remove them from the beginning of the queue
		for (int i = 0; i < queue.size(); i++) {
			queue.add(queue.remove());
		}
		System.out.println(queue);
	}
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		// Add Elements {0,1,2,3,4,5,6,7,8,9}
		for (int i = 0; i < 10; i++) {
			queue.add(i);
		}
		reverse(queue, 5);
		
		
	}

}
