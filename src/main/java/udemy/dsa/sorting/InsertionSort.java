package udemy.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

	// time complexity O(n^2), space complexity O(1)
	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Before insertion sort -> " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After insertion sort -> " + Arrays.toString(arr));
	}

}