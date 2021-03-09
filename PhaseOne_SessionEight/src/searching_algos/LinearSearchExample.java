package searching_algos;

class LinearSearch {
	
	public int linearSearch(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == element)
				return i;
		}
		return -1;
	}
}

public class LinearSearchExample {
	
	public static void main(String[] args) {
		
		LinearSearch search = new LinearSearch();
		int[] numbers = {23,45,32,12,56,70};
		int index = search.linearSearch(numbers, 120);
		System.out.println("Element Found at Index : " + index);
	}
}
