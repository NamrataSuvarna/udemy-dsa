package udemy.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Before merge sort -> " + Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("After merge sort -> " + Arrays.toString(arr));
	}

	// time complexity O(nlogn), space complexity O(n)
	private static void merge(int[] arr, int left, int middle, int right) {
		int[] leftArray = new int[middle - left + 2];
		int[] rightArray = new int[right - middle + 1];
		for (int i = 0; i < middle - left + 1; i++) {
			leftArray[i] = arr[left + i];
		}
		for (int i = 0; i < right - middle; i++) {
			rightArray[i] = arr[middle + 1 + i];
		}
		leftArray[middle - left + 1] = Integer.MAX_VALUE;
		rightArray[right - middle] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k <= right; k++) {
			if (leftArray[i] < rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
		}
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if (right > left) {
			int middle = (left + right) / 2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle, right);
			merge(arr, left, middle, right);
		}
	}

}