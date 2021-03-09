package queue_demos;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementationExample {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		// Add Elements {0,1,2,3,4}
		for (int i = 0; i < 5; i++) {
			queue.add(i);
		}
		
		System.out.println(queue);
		int element = queue.remove();
		System.out.println("Removed Element : " + element);
		element = queue.remove();
		System.out.println("Removed Element : " + element);
		// Peek method is to view the head of queue
		element = queue.peek();
		System.out.println("Element at Peek is " + element);
		int size = queue.size();
		System.out.println("Queue Size : " + size);
		
		
	}
}
