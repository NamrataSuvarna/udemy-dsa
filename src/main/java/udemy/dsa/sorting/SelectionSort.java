package udemy.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Before selection sort -> " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After selection sort -> " + Arrays.toString(arr));
	}

	// time complexity O(n^2), space complexity O(1)
	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimumIndex]) {
					minimumIndex = j;
				}
			}
			if (minimumIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minimumIndex];
				arr[minimumIndex] = temp;
			}
		}
	}

}