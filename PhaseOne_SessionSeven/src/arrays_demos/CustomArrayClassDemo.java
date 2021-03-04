package arrays_demos;

class Array {
	
	private int[] items;
	private int count;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void print() {
		System.out.println("Iterating Elements: ");
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	
	public void insert(int item) {
		// If the array is full, resize it.
		if(items.length == count) {
			// Create a new Array (Twice the Size)
			int[] newItems = new int[count*2];
			// Copy all the existing items
			for (int i = 0; i < count; i++)
				newItems[i] = items[i];
			// Set "items" to this new array
				items = newItems;
		}
		// Add the new element at the end.
		items[count++] = item;
	}
	
	public void removeAt(int index) {
		// Validate the index
		if(index<0 || index >= count)
			throw new IllegalArgumentException();
		// Shift the items to left to fill the hole.
		for (int i = index; i < count; i++)
			items[i] = items[i+1];
		count--;
	}
	
	public int indexOf(int item) {
		// If we find element, return index
		// If we found element at index 1 : Complexity would be O(1)
		// If we found element at last index: Complexity would be O(n)
		for (int i = 0; i < count; i++) {
			if(items[i] == item)
				return i;
		}
		// Otherwise return -1
		return -1;
	}
	
}

public class CustomArrayClassDemo {

	public static void main(String[] args) {
		
		Array numbers = new Array(3);
		
		numbers.insert(100);
		numbers.insert(200);
		numbers.insert(300);
		numbers.insert(400);
		numbers.insert(500);
		numbers.insert(600);
		numbers.insert(700);
		numbers.print();
		numbers.removeAt(2);
		System.out.println("-----------------------");
		numbers.print();
		System.out.println("-----------------------");
		System.out.println("Index : " + numbers.indexOf(600));
		System.out.println("Index : " + numbers.indexOf(800));
		
	}
}
