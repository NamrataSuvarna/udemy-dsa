package udemy.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

//Not space efficient
public class BinaryTreeUsingLinkedList {

	public BinaryTreeNode root;

	public BinaryTreeUsingLinkedList() {
	}

	// Time & Space Complexity O(1)
	public void delete() {
		root = null;
		System.out.println("Tree deleted.");
	}

	// Time & Space Complexity O(n)
	public void delete(String value) {
		Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();
		binaryTreeNodes.add(root);
		while (!binaryTreeNodes.isEmpty()) {
			BinaryTreeNode binaryTreeNode = binaryTreeNodes.remove();
			if (binaryTreeNode.value == value) {
				binaryTreeNode.value = getDeepestNode().value;
				deleteDeepestNode();
				return;
			}
			if (binaryTreeNode.left != null) {
				binaryTreeNodes.add(binaryTreeNode.left);
			}
			if (binaryTreeNode.right != null) {
				binaryTreeNodes.add(binaryTreeNode.right);
			}
		}
		System.out.println("Value " + value + " not present in the tree.");
	}

	private void deleteDeepestNode() {
		Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();
		binaryTreeNodes.add(root);
		BinaryTreeNode parentNode, childNode = null;
		while (!binaryTreeNodes.isEmpty()) {
			parentNode = childNode;
			childNode = binaryTreeNodes.remove();
			if (childNode.left == null) {
				parentNode.right = null;
				return;
			}
			if (childNode.right == null) {
				childNode.left = null;
				return;
			}
			binaryTreeNodes.add(childNode.left);
			binaryTreeNodes.add(childNode.right);
		}
	}

	private BinaryTreeNode getDeepestNode() {
		Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();
		binaryTreeNodes.add(root);
		BinaryTreeNode binaryTreeNode = null;
		while (!binaryTreeNodes.isEmpty()) {
			binaryTreeNode = binaryTreeNodes.remove();
			if (binaryTreeNode.left != null) {
				binaryTreeNodes.add(binaryTreeNode.left);
			}
			if (binaryTreeNode.right != null) {
				binaryTreeNodes.add(binaryTreeNode.right);
			}
		}
		return binaryTreeNode;
	}

	// Time & Space Complexity O(n)
	public void inOrderTraversal(BinaryTreeNode binaryTreeNode) {
		if (binaryTreeNode == null) {
			return;
		}
		inOrderTraversal(binaryTreeNode.left);
		System.out.print(binaryTreeNode.value + " ");
		inOrderTraversal(binaryTreeNode.right);
	}

	// Time & Space Complexity O(n)
	public void insert(String value) {
		BinaryTreeNode newBinaryTreeNode = new BinaryTreeNode(value);
		if (root == null) {
			root = newBinaryTreeNode;
			System.out.println("Inserted value " + value + " as root.");
			return;
		}
		Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();
		binaryTreeNodes.add(root);
		while (!binaryTreeNodes.isEmpty()) {
			BinaryTreeNode binaryTreeNode = binaryTreeNodes.remove();
			if (binaryTreeNode.left == null) {
				binaryTreeNode.left = newBinaryTreeNode;
				System.out.println("Inserted value " + value + " as left child of " + binaryTreeNode.value + ".");
				return;
			}
			if (binaryTreeNode.right == null) {
				binaryTreeNode.right = newBinaryTreeNode;
				System.out.println("Inserted value " + value + " as right child of " + binaryTreeNode.value + ".");
				return;
			}
			binaryTreeNodes.add(binaryTreeNode.left);
			binaryTreeNodes.add(binaryTreeNode.right);
		}
	}

	// Time & Space Complexity O(n)
	public void levelOrderTraversal() {
		Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();
		binaryTreeNodes.add(root);
		while (!binaryTreeNodes.isEmpty()) {
			BinaryTreeNode binaryTreeNode = binaryTreeNodes.remove();
			System.out.print(binaryTreeNode.value + " ");
			if (binaryTreeNode.left != null) {
				binaryTreeNodes.add(binaryTreeNode.left);
			}
			if (binaryTreeNode.right != null) {
				binaryTreeNodes.add(binaryTreeNode.right);
			}
		}
	}

	// Time & Space Complexity O(n)
	public void postOrderTraversal(BinaryTreeNode binaryTreeNode) {
		if (binaryTreeNode == null) {
			return;
		}
		postOrderTraversal(binaryTreeNode.left);
		postOrderTraversal(binaryTreeNode.right);
		System.out.print(binaryTreeNode.value + " ");
	}

	// Time & Space Complexity O(n)
	public void preOrderTraversal(BinaryTreeNode binaryTreeNode) {
		if (binaryTreeNode == null) {
			return;
		}
		System.out.print(binaryTreeNode.value + " ");
		preOrderTraversal(binaryTreeNode.left);
		preOrderTraversal(binaryTreeNode.right);
	}

	// Time & Space Complexity O(n)
	public void search(String value) {
		Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();
		binaryTreeNodes.add(root);
		while (!binaryTreeNodes.isEmpty()) {
			BinaryTreeNode binaryTreeNode = binaryTreeNodes.remove();
			if (binaryTreeNode.value == value) {
				System.out.println("Value " + value + " found in the tree.");
				return;
			}
			if (binaryTreeNode.left != null) {
				binaryTreeNodes.add(binaryTreeNode.left);
			}
			if (binaryTreeNode.right != null) {
				binaryTreeNodes.add(binaryTreeNode.right);
			}
		}
		System.out.println("Value " + value + " not found in the tree.");
	}

}