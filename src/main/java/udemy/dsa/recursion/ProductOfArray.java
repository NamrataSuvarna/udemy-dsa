package udemy.dsa.recursion;

public class ProductOfArray {

	private static int getProductOfArray(int A[], int N) {
		if (N <= 0) {
			return 1;
		}
		return A[N - 1] * getProductOfArray(A, N - 1);
	}

	public static void main(String[] args) {
		System.out.println(getProductOfArray(new int[] { 1, 2, 3, 4, 5 }, 5));
	}

}