package udemy.dsa.recursion;

public class DecimalToBinary {

	private static int getDecimalToBinary(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 0;
		}
		return n % 2 + 10 * getDecimalToBinary(n / 2);
	}

	public static void main(String[] args) {
		System.out.println(getDecimalToBinary(31));
		System.out.println(getDecimalToBinary(13));
		System.out.println(getDecimalToBinary(-10));
	}

}