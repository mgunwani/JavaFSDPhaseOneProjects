package sorting_alogrithms;
import java.util.Arrays;
class BubbleSort {
	public void Sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
				}
			}
		}
	}
	public void swap(int[] array, int index1, int index2) {
		var temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}

public class BubbleSortImplementation {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 1, 3, 8 };
		BubbleSort sorter = new BubbleSort();
		sorter.Sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
