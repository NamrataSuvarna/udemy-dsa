package udemy.dsa.recursion;

public class Fib {

	private static int getFibonacci(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return getFibonacci(n - 2) + getFibonacci(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(getFibonacci(5));
		System.out.println(getFibonacci(4));
		System.out.println(getFibonacci(-3));
	}

}