package searching_algos;

class BinarySearch {
	
	public int binarySearchIterative(int[] array, int element) {
		var left = 0;
		var right = array.length -1;	
		while(left <= right) {
			var middle = (left+right)/2;
			if(array[middle]== element) {
				return middle;
			} if(element < array[middle]) {
				right = middle-1;
			} else {
				left = middle+1;
			}
		}
		return -1;
	}
	
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
}
public class BinarySearchExample {
	
	public static void main(String[] args) {
		
		BinarySearch search = new BinarySearch();
		
		int[] numbers = {5,10,12,15,20};
		int index = search.binarySearchRecursive(numbers, 100, 0, numbers.length - 1);
		System.out.println("Element Found at Index : " + index);
		
		/*
		int[] numbers = {5,10,12,15,20};
		int index = search.binarySearchIterative(numbers, 12);
		System.out.println("Element Found at Index : " + index);
		*/
		
		
	}

}
