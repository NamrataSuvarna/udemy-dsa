package udemy.dsa.recursion;

public class FirstUppercase {

	private static char getFirstUppercase(String s) {
		if (s.isBlank()) {
			return ' ';
		}
		if (Character.isUpperCase(s.charAt(0))) {
			return s.charAt(0);
		}
		return getFirstUppercase(s.substring(1));
	}

	public static void main(String[] args) {
		System.out.println(getFirstUppercase("appmillerS"));
	}

}