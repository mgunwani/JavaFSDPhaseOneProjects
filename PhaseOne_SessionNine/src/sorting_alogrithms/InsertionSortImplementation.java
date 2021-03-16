package sorting_alogrithms;

import java.util.Arrays;
class InsertionSort {
	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			var current = array[i];
			var  j = i - 1;
			while(j >= 0 && array[j] > current) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = current;
		}
	}
}

public class InsertionSortImplementation {
	public static void main(String[] args) {
		int[] numbers = {7, 3, 5, 2, 3, 1};
		InsertionSort sorter = new InsertionSort();
		sorter.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
