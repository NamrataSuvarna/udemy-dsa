package udemy.dsa.recursion;

public class Power {

	private static int getPower(int base, int exponent) {
		if (exponent < 0) {
			return -1;
		}
		if (exponent == 0) {
			return 1;
		}
		return base * getPower(base, exponent - 1);
	}

	public static void main(String[] args) {
		System.out.println(getPower(2, -2));
		System.out.println(getPower(5, 3));
		System.out.println(getPower(4, 1));
	}

}