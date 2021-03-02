
class BigONotation {
	
	// O(1) - Constant Time
	// Because input array could 1 item or 1000 items
	void printFirstElementofArray(int[] numbers) {
		System.out.println(numbers[0]);
	}
	
	// O(n) - Linear Time
	// Where n is the number of items in array and i.e. not fixed
	void printAllElementsOfArray(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	// O(n^2) - Quadratic Time
	// Where, If the array has 10 items, we have to print 100 items or depends upon array size.
	void printAllPossibleOrderedPairs(int[] numbers, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println(numbers[i] + " : " + numbers[j]);
			}
		}
	}
	
	// O(2^n) - Exponential Time
	// Here, it is recursive calculation.
	// In this notation, the growth doubles with each addition to input.
	int fibonacci(int num) {
		if(num<=1) return num;
		return fibonacci(num-2) + fibonacci(num-1);
	}
	
	// O(2n) => O(n)
	void printAllItemsTwice(int[] numbers, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	// O(1) + O(n/2) + O(100)
	// O(n) + O(101)
	// O(n)	- Linear Time
	void printFirstItemThenFirstHalfThenSayHi100Times(int[] numbers, int size) {
		System.out.println(numbers[0]);
		for (int i = 0; i < size/2; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi");
		}
	}
	
}

public class BigONotationExample {

	public static void main(String[] args) {
		
	    int[] numbers = {1,2,3,4,5};
        int size = numbers.length;
        
        BigONotation big = new BigONotation();
        
        big.printFirstElementofArray(numbers);
        System.out.println("------------------");
        big.printAllElementsOfArray(numbers);
        System.out.println("------------------");
        big.printAllPossibleOrderedPairs(numbers, size);
        System.out.println("------------------");
        big.printAllItemsTwice(numbers, size);
        System.out.println("------------------");
        System.out.println(big.fibonacci(size));
        System.out.println("------------------");
        big.printFirstItemThenFirstHalfThenSayHi100Times(numbers, size);
        System.out.println("------------------");
		
	}
	
}
