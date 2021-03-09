package linked_list_demos;

import java.util.NoSuchElementException;

class LinkedList {
	// Creating Node as Private Class to use in LinkedList Class
	private class Node {
		private int value;
		private Node next;
		// Assign Node Value using Parameterized Constructor
		public Node(int value) {
			this.value = value;
		}
	}
	
	Node first;
	Node last;

	// Adding Last Element in LinkedList
	public void addLast(int item) {
		// Creating New Node
		Node node = new Node(item);
		// To check if LinkedList is Empty or Not
		// If Empty set first and last node as Current Node
		// If LinkedList is Not Empty assign the Current Node to the next of LAST nODE
		if(isEmpty()) {
			first = last = node;
		} else {	
			last.next = node;
			last = node;			
		}
	}
	
	// Add the First Element in LinkedList
	public void addFirst(int item) {
		var node = new Node(item);
		// To check if LinkedList is Empty or Not
		// If Empty set first and last node as Current Node
		// If LinkedList is Not Empty assign the set the next of current node as First and 
		// New Node as the First Node
		if(isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}
	
	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while(current != null) {
			if(current.value == item)
				return index;
			current = current.next;
			index++;
		}
		return -1;
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	// Contains the element or not
	// If contains return true otherwise return false
	
	// Remove First Element from LinkedList
	public void removeFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		} if(first == last) {
			first = last = null;
		} else {
			var second = first.next;
			first.next = null;
			first = second;
		}
	}
	
	private Node getPrevious(Node node) {
		var current = first;
		while(current!= null) {
			if(current.next == node)
				return current;
			current = current.next;
		}
		return null;
	}
	
	// Remove Last Element from LinkedList
	public void removeLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		} if(first == last) {
			first = last = null;
		} else {
			var previous = getPrevious(last);
			last = previous;
			last.next = null;
		}
		
	}
	
	public void traverse(LinkedList list) {
        Node n = list.first; 
        if(n == null)System.out.println("No Elements in the List to travel..");
        else {
            while(n!=null) {
                System.out.println(n.value+" ");
                n = n.next;
            }
        }
    }
}

public class CustomLinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addLast(100);
		list.addLast(200);
		list.addFirst(150);
		System.out.println("Index : " + list.indexOf(1500));
	}
	
}
