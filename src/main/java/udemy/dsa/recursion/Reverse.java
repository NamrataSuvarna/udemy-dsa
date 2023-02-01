package udemy.dsa.recursion;

public class Reverse {

	private static String getReverse(String str) {
		if (str.isBlank()) {
			return "";
		}
		return str.charAt(str.length() - 1) + getReverse(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		System.out.println(getReverse("java"));
		System.out.println(getReverse("appmillers"));
	}

}