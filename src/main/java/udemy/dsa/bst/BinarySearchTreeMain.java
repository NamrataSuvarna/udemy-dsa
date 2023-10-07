package udemy.dsa.bst;

public class BinarySearchTreeMain {

	public static void main(String[] args) {

		// Space & Time Complexity -> O(1)
		BinarySearchTree binarySearchTree = new BinarySearchTree();

		// Space & Time Complexity -> O(LogN)
		binarySearchTree.insert(70);
		binarySearchTree.insert(50);
		binarySearchTree.insert(90);
		binarySearchTree.insert(30);
		binarySearchTree.insert(60);
		binarySearchTree.insert(80);
		binarySearchTree.insert(100);
		binarySearchTree.insert(20);
		binarySearchTree.insert(40);

		// Space & Time Complexity -> O(N)
		System.out.print("Pre order traversal -> ");
		binarySearchTree.preOrderTraversal(binarySearchTree.root);
		System.out.println();
		System.out.print("In order traversal -> ");
		binarySearchTree.inOrderTraversal(binarySearchTree.root);
		System.out.println();
		System.out.print("Post order traversal -> ");
		binarySearchTree.postOrderTraversal(binarySearchTree.root);
		System.out.println();
		System.out.print("Level order traversal -> ");
		binarySearchTree.levelOrderTraversal();
		System.out.println();

		// Space & Time Complexity -> O(LogN)
		binarySearchTree.search(binarySearchTree.root, 10);
		binarySearchTree.search(binarySearchTree.root, 100);

		// Space & Time Complexity -> O(LogN)
		binarySearchTree.levelOrderTraversal();
		System.out.println();
		binarySearchTree.delete(binarySearchTree.root, 40);
		binarySearchTree.levelOrderTraversal();
		System.out.println();
		binarySearchTree.delete(binarySearchTree.root, 90);
		binarySearchTree.levelOrderTraversal();
		System.out.println();

		// Space & Time Complexity -> O(1)
		binarySearchTree.delete();
		System.out.println("Binary search tree root -> " + binarySearchTree.root);

	}

}