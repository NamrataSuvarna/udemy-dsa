package udemy.dsa.recursion;

public class CapitalizedWord {

	private static String getCapitalizedWord(String str) {
		if (str.isBlank()) {
			return "";
		}
		char ch = str.charAt(str.length() - 1);
		if (str.length() == 1) {
			return Character.toUpperCase(ch) + "";
		}
		if (str.substring(str.length() - 2, str.length() - 1).equals(" ")) {
			ch = Character.toUpperCase(ch);
		}
		return getCapitalizedWord(str.substring(0, str.length() - 1)) + (ch + "");
	}

	public static void main(String[] args) {
		System.out.println(getCapitalizedWord("i love java"));
	}

}