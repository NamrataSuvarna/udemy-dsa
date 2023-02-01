package udemy.dsa.recursion;

import java.util.Arrays;

class OddFunction {
	boolean run(int num) {
		if (num % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
}

public class SomeRecursive {

	private static boolean isSomeRecursive(int[] arr, OddFunction odd) {
		if (arr.length == 0) {
			return false;
		}
		if (odd.run(arr[0])) {
			return true;
		}
		return isSomeRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
	}

	public static void main(String[] args) {
		System.out.println(isSomeRecursive(new int[] { 1, 2, 3, 4 }, new OddFunction()));
		System.out.println(isSomeRecursive(new int[] { 4, 6, 8, 9 }, new OddFunction()));
		System.out.println(isSomeRecursive(new int[] { 4, 6, 8 }, new OddFunction()));
	}

}