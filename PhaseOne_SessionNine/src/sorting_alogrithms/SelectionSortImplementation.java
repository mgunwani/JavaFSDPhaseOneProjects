package sorting_alogrithms;

import java.util.Arrays;

class SelectionSort {
	
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			var minIndex = i;
			for (int j = i; j < array.length; j++) {
				if(array[j] < array[minIndex])
					minIndex = j;
			}
			swap(array, minIndex, i);
		}
	}
	public void swap(int[] array, int index1, int index2) {
		var temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}

public class SelectionSortImplementation {

	public static void main(String[] args) {
		int[] numbers = { 7, 3, 1, 5, 2 };
		SelectionSort sorter = new SelectionSort();
		sorter.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
}
