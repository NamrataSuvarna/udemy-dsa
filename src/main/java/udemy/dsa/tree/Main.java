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

	private static BinaryTree getSampleBinaryTree() {
		BinaryTree binaryTree = new BinaryTree();

		BinaryTreeNode n9 = new BinaryTreeNode();
		n9.value = "n9";

		BinaryTreeNode n8 = new BinaryTreeNode();
		n8.value = "n8";

		BinaryTreeNode n7 = new BinaryTreeNode();
		n7.value = "n7";

		BinaryTreeNode n6 = new BinaryTreeNode();
		n6.value = "n6";

		BinaryTreeNode n5 = new BinaryTreeNode();
		n5.value = "n5";

		BinaryTreeNode n4 = new BinaryTreeNode();
		n4.value = "n4";
		n4.left = n8;
		n4.right = n9;

		BinaryTreeNode n3 = new BinaryTreeNode();
		n3.value = "n3";
		n3.left = n6;
		n3.right = n7;

		BinaryTreeNode n2 = new BinaryTreeNode();
		n2.value = "n2";
		n2.left = n4;
		n2.right = n5;

		BinaryTreeNode n1 = new BinaryTreeNode();
		n1.value = "n1";
		n1.left = n2;
		n1.right = n3;

		binaryTree.root = n1;

		return binaryTree;
	}

	public static void main(String[] args) {
		basicTreeExample();

		BinaryTree sampleBinaryTree = getSampleBinaryTree();
		sampleBinaryTree.preOrderTraversal(sampleBinaryTree.root);
		System.out.println();
		sampleBinaryTree.inOrderTraversal(sampleBinaryTree.root);
		System.out.println();
		sampleBinaryTree.postOrderTraversal(sampleBinaryTree.root);
		System.out.println();
		sampleBinaryTree.levelOrderTraversal();
	}

}