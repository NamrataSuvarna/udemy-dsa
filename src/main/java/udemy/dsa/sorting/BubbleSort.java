package udemy.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

	// time complexity O(n^2), space complexity O(1)
	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Before bubble sort -> " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After bubble sort -> " + Arrays.toString(arr));
	}

}