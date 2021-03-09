package searching_algos;

class ExponentialSearch {
	
	public int binarySearchRecursive(int[] array, int element, int left, int right) {
		
		if(right < left)
			return -1;
		
		int middle = (left + right)/2;
		if(array[middle]  == element)
			return middle;
		
		if(element < array[middle])
			return binarySearchRecursive(array, element, left, middle-1);
		
		return binarySearchRecursive(array, element, middle+1, right);
	}
	
	public int exponentialSearch(int[] array, int element) {
		
		int bound = 1;
		while(bound < array.length && array[bound] < element)
			bound = bound * 2;
		
		int left = bound/2;
		int right = Math.min(bound, array.length-1);
		
		return binarySearchRecursive(array, element, left, right);
	}
}

public class ExponentialSearchExample {

	public static void main(String[] args) {
		
		ExponentialSearch search = new ExponentialSearch();
		int[] numbers = {1,4,6,8,10,14};
		int index = search.exponentialSearch(numbers, 40);
		System.out.println("Element Found at Index : " + index);
		
	}
	
}
