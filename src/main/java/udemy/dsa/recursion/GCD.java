package udemy.dsa.recursion;

public class GCD {

	// euclidean algorithm
	private static int getGCD(int a, int b) {
		if (a < 0 || b < 0) {
			return -1;
		}
		if (b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}

	public static void main(String[] args) {
		System.out.println(getGCD(48, 18));
		System.out.println(getGCD(8, 12));
		System.out.println(getGCD(-8, 4));
	}

}