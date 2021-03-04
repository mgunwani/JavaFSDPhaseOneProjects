package linked_list_demos;

import java.util.LinkedList;

public class WorkingWithLinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addLast(100);
		list.addLast(200);
		list.addFirst(150);
		list.add(1, 180);
		System.out.println(list);
		System.out.println("-----------------");
		list.removeFirst();
		list.removeLast();
		list.remove(1);
		System.out.println(list);
		System.out.println("-----------------");
		System.out.println(list.contains(150));
		
	}
	
}
