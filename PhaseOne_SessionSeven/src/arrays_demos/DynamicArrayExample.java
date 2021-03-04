package arrays_demos;

import java.util.ArrayList;

public class DynamicArrayExample {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		for (int value : list) {
			System.out.println(value);
		}
		
		list.remove(2);
		
		System.out.println("Index: " + list.indexOf(100));
		
		for (int value : list) {
			System.out.println(value);
		}
		
		
	}
}
