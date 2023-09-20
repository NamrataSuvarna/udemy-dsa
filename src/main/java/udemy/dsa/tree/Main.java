package udemy.dsa.tree;

public class Main {

	private static void basicTreeExample() {
		TreeNode hot = new TreeNode("Hot");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		hot.addChild(tea);
		hot.addChild(coffee);

		TreeNode cold = new TreeNode("Cold");
		TreeNode wine = new TreeNode("Wine");
		TreeNode beer = new TreeNode("Beer");
		cold.addChild(wine);
		cold.addChild(beer);

		TreeNode drinks = new TreeNode("Drinks");
		drinks.addChild(hot);
		drinks.addChild(cold);

		System.out.println(drinks.print(0));
	}

	// Create -> Time Complexity O(1), Space Complexity O(n)
	private static BinaryTreeUsingArray getSampleArrayBinaryTree() {
		BinaryTreeUsingArray binaryTree = new BinaryTreeUsingArray(9);
		binaryTree.insert("n1");
		binaryTree.insert("n2");
		binaryTree.insert("n3");
		binaryTree.insert("n4");
		binaryTree.insert("n5");
		binaryTree.insert("n6");
		binaryTree.insert("n7");
		binaryTree.insert("n8");
		binaryTree.insert("n9");
		binaryTree.insert("n10");
		return binaryTree;
	}

	// Create -> Time & Space Complexity O(1)
	private static BinaryTreeUsingLinkedList getSampleLinkedListBinaryTree() {
		BinaryTreeUsingLinkedList binaryTree = new BinaryTreeUsingLinkedList();

		BinaryTreeNode n9 = new BinaryTreeNode("n9");

		BinaryTreeNode n8 = new BinaryTreeNode("n8");

		BinaryTreeNode n7 = new BinaryTreeNode("n7");

		BinaryTreeNode n6 = new BinaryTreeNode("n6");

		BinaryTreeNode n5 = new BinaryTreeNode("n5");

		BinaryTreeNode n4 = new BinaryTreeNode("n4");
		n4.left = n8;
		n4.right = n9;

		BinaryTreeNode n3 = new BinaryTreeNode("n3");
		n3.left = n6;
		n3.right = n7;

		BinaryTreeNode n2 = new BinaryTreeNode("n2");
		n2.left = n4;
		n2.right = n5;

		BinaryTreeNode n1 = new BinaryTreeNode("n1");
		n1.left = n2;
		n1.right = n3;

		binaryTree.root = n1;

		return binaryTree;
	}

	public static void main(String[] args) {
		basicTreeExample();

		BinaryTreeUsingLinkedList binaryTreeUsingLinkedList = getSampleLinkedListBinaryTree();
		binaryTreeUsingLinkedList.preOrderTraversal(binaryTreeUsingLinkedList.root);
		System.out.println();
		binaryTreeUsingLinkedList.inOrderTraversal(binaryTreeUsingLinkedList.root);
		System.out.println();
		binaryTreeUsingLinkedList.postOrderTraversal(binaryTreeUsingLinkedList.root);
		System.out.println();
		binaryTreeUsingLinkedList.levelOrderTraversal();
		System.out.println();
		binaryTreeUsingLinkedList.insert("n10");
		binaryTreeUsingLinkedList.levelOrderTraversal();
		System.out.println();
		binaryTreeUsingLinkedList.search("n1");
		binaryTreeUsingLinkedList.search("n0");
		binaryTreeUsingLinkedList.delete("n3");
		binaryTreeUsingLinkedList.levelOrderTraversal();
		System.out.println();
		binaryTreeUsingLinkedList.delete("n11");
		binaryTreeUsingLinkedList.delete();
		System.out.println("Root " + binaryTreeUsingLinkedList.root + " -> Tree not found.");
		System.out.println();

		BinaryTreeUsingArray binaryTreeUsingArray = getSampleArrayBinaryTree();
		binaryTreeUsingArray.preOrderTraversal(1);
		System.out.println();
		binaryTreeUsingArray.inOrderTraversal(1);
		System.out.println();
		binaryTreeUsingArray.postOrderTraversal(1);
		System.out.println();
		binaryTreeUsingArray.levelOrderTraversal();
		System.out.println();
		binaryTreeUsingArray.search("n1");
		binaryTreeUsingArray.search("n0");
		binaryTreeUsingArray.delete("n3");
		binaryTreeUsingArray.levelOrderTraversal();
		System.out.println();
		binaryTreeUsingArray.delete("n11");
		binaryTreeUsingArray.delete();
		System.out.println("Array " + binaryTreeUsingArray.arr + " -> Tree not found.");
	}

}