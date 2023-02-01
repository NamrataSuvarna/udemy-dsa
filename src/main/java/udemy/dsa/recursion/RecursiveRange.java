package udemy.dsa.recursion;

public class RecursiveRange {

	private static int getRecursiveRange(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 0;
		}
		return n + getRecursiveRange(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(getRecursiveRange(6));
		System.out.println(getRecursiveRange(10));
		System.out.println(getRecursiveRange(-3));
	}

}