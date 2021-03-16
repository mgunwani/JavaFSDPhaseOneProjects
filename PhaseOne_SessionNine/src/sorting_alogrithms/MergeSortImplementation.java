package sorting_alogrithms;

import java.util.Arrays;

class MergeSort {
	
	public void sort(int[] array) {
		if(array.length < 2)
			return;
		// Divide the array into half
		var middle = array.length/2;
		
		int[] left = new int[middle];
		for (int i = 0; i < middle; i++)
			left[i] = array[i];
		
		int[] right = new int[array.length-middle];
		for (int i = middle; i < array.length; i++)
			right[i-middle] = array[i];
		
		// Sort Each Half
		sort(left);
		sort(right);
		
		// Merge the Result
		merge(left, right, array);
	}
	public void merge(int[] left, int[] right, int[] result) {
		int i=0, j=0, k=0;
		while(i<left.length && j< right.length) {
			if(left[i]<= right[j])
				result[k++] = left[i++];
			else
				result[k++] = right[j++];
		}
		while(i<left.length)
			result[k++] = left[i++];
		
		while(j<right.length)
			result[k++] = right[j++];
	}
}

public class MergeSortImplementation {
	public static void main(String[] args) {
		int[] numbers = { 7, 3, 5, 2, 3, 1, 5, 8 };
		MergeSort sorter = new MergeSort();
		sorter.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
