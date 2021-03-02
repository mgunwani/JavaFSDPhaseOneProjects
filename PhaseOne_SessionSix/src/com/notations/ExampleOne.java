package com.notations;

import java.util.Iterator;

class Notation {
	
	/*
	public void display(int[] numbers) {
		// O(1) + O(1)
		// O(2) => O(1) - Constant Big O Notation
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
	}
	*/
	
	/*
	public void display(int[] numbers) {
		// O(1) + O(n) + O(1)
		// O(n) + O(2)
		// O(n)
		System.out.println(); // O(1)
		for (int i = 0; i < numbers.length; i++) {	// O(n)
			System.out.println(numbers[i]);
		}
		System.out.println(); 	// O(1)
	}
	*/
	
	/*
	public void display(int[] numbers) {
		// O(n) + O(n)
		// O(n)
		for (int i = 0; i < numbers.length; i++) {	// O(n)
			System.out.println(numbers[i]);
		}
		for (int number : numbers) {				// O (n)
			System.out.println(number);
		}
	}
	*/
	
	/*
	public void display(int[] numbers, String[] names) {
		
		// O(n) + O(m)
		// O(n)
		
		for (int number : numbers) {				// O(n)
			System.out.println(number);
		}
		
		for (String name : names) {					// O(m)
			System.out.println(name);
		}
	}
	*/
	
	public void display(int[] numbers) {
		
		// O(n) * O(n)
		// O (n^2)	- Quadratic Notation
		
		// O(n) + O(n*2)
		// O(n*2)
		
		for (int num : numbers) {			// O(n)
			System.out.println(num);
		}
		
		for (int first : numbers) {			// O(n)
			for (int second : numbers) {	// O(n)
				System.out.println(first + " : " + second);
			}
		}
		
		// O(n) * O(n) * O(n)
		// O(n^3)
		// O(n^2)	
		
		for (int first : numbers) {				// O(n)
			for (int second : numbers) {		// O(n)
				for (int third : numbers) {		// O(n)
					System.out.println(first + " : " + second + " : " + third);
				}
			}
		}
	}
}

public interface ExampleOne {
	
	public static void main(String[] args) {
		
		Notation obj = new Notation();
		int[] nums = {1,2,3,4,5};
		String[] names = {"King", "Kochhar", "Sarah"};
		 obj.display(nums);
		// obj.display(nums, names);
		
	}
}
