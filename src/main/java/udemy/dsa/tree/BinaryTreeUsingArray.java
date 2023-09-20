package udemy.dsa.tree;

//Space efficient
public class BinaryTreeUsingArray {

	String[] arr;

	int lastUsedIndex;

	public BinaryTreeUsingArray(int size) {
		arr = new String[size + 1];
	}

	// Time & Space Complexity O(1)
	public void delete() {
		arr = null;
		System.out.println("Tree deleted.");
	}

	// Time Complexity O(n), Space Complexity O(1)
	public void delete(String value) {
		int location = search(value);
		if (location == -1) {
			System.out.println("Value " + value + " not present in the tree.");
			return;
		}
		arr[location] = arr[lastUsedIndex];
		lastUsedIndex--;
	}

	// Time & Space Complexity O(n)
	public void inOrderTraversal(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		inOrderTraversal(2 * index);
		System.out.print(arr[index] + " ");
		inOrderTraversal(2 * index + 1);
	}

	// Time & Space Complexity O(1)
	public void insert(String value) {
		if (lastUsedIndex == arr.length - 1) {
			System.out.println("Array is full!");
			return;
		}
		arr[lastUsedIndex + 1] = value;
		lastUsedIndex++;
	}

	// Time Complexity O(n), Space Complexity O(1)
	public void levelOrderTraversal() {
		for (int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Time & Space Complexity O(n)
	public void postOrderTraversal(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		postOrderTraversal(2 * index);
		postOrderTraversal(2 * index + 1);
		System.out.print(arr[index] + " ");
	}

	// Time & Space Complexity O(n)
	public void preOrderTraversal(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + " ");
		preOrderTraversal(2 * index);
		preOrderTraversal(2 * index + 1);
	}

	// Time Complexity O(n), Space Complexity O(1)
	public int search(String value) {
		for (int i = 1; i <= lastUsedIndex; i++) {
			if (arr[i] == value) {
				System.out.println("Value " + value + " found in the tree.");
				return i;
			}
		}
		System.out.println("Value " + value + " not found in the tree.");
		return -1;
	}

}