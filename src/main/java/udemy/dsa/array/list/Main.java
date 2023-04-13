package udemy.dsa.array.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Creating array
		// Time complexity O(1)
		ArrayList<Integer> listWithNoSize = new ArrayList<Integer>(); // Space complexity O(1)
		System.out.println(listWithNoSize);
		ArrayList<Integer> listWithSize = new ArrayList<Integer>(30); // Space complexity O(n)
		System.out.println(listWithSize);
		ArrayList<Integer> listWithElements = new ArrayList<Integer>(Arrays.asList(1, 2, 3)); // Space complexity O(n)
		System.out.println(listWithElements);

		// Accessing array elements
		// Time complexity O(1), Space complexity O(1)
		ArrayList<String> addStrings = new ArrayList<String>();
		addStrings.add("A");
		addStrings.add("B");
		addStrings.add(2, "C");
		System.out.println(addStrings);
		System.out.println(addStrings.get(2));

		// Deleting array elements
		// Time complexity O(n), Space complexity O(1)
		ArrayList<String> removeStrings = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		removeStrings.remove(2);
		System.out.println(removeStrings);
		removeStrings.remove("E");
		System.out.println(removeStrings);

	}

}