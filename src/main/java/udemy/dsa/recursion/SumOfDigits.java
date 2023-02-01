package udemy.dsa.recursion;

public class SumOfDigits {

	private static int getSumOfDigits(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 0;
		}
		return (n % 10) + getSumOfDigits(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(getSumOfDigits(21));
		System.out.println(getSumOfDigits(985));
		System.out.println(getSumOfDigits(-111));
	}

}