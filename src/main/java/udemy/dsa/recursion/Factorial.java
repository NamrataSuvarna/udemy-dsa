package udemy.dsa.recursion;

public class Factorial {

	private static int getFactorial(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * getFactorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(getFactorial(6));
		System.out.println(getFactorial(3));
		System.out.println(getFactorial(-2));
	}

}