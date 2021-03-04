package arrays_demos;

public class ArrayExampleOne {

	public static void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Element of Array : " + min);
	}
	
	public static void main(String[] args) {
	
		// Declaration
		int arr1[] = new int[5];
		
		// Assignment
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		
		// Initialization = Declaration + Assignment
		int arr2[] = {1,120,30,4,15};
		
		// Access the elements using for loop
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("----------------------");
		
		// Access the elements using foreach loop
		for (int number : arr2) {
			System.out.println(number);
		}
		
		System.out.println("----------------------");
		
		// Initialize the array and pass to method
		int arr3[] = {10,5,67,3,9};
		min(arr3);
		
		System.out.println("----------------------");
		
		// Pass Annonymous array to method
		min(new int[] {11,4,7,89,4});
		
	}
	
}
