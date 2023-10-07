package udemy.dsa.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	BinarySearchTreeNode root;

	public void delete() {
		root = null;
	}

	public BinarySearchTreeNode delete(BinarySearchTreeNode binarySearchTreeNode, int value) {
		if (binarySearchTreeNode == null) {
			System.out.println("Value " + value + " not present in the tree.");
			return null;
		}
		if (value < binarySearchTreeNode.value) {
			binarySearchTreeNode.left = delete(binarySearchTreeNode.left, value);
		}
		if (value > binarySearchTreeNode.value) {
			binarySearchTreeNode.right = delete(binarySearchTreeNode.right, value);
		}
		if (value == binarySearchTreeNode.value) {
			if (binarySearchTreeNode.left != null && binarySearchTreeNode.right != null) {
				BinarySearchTreeNode minimumNode = getMinimumNode(binarySearchTreeNode.right);
				binarySearchTreeNode.value = minimumNode.value;
				binarySearchTreeNode.right = delete(binarySearchTreeNode.right, minimumNode.value);
			} else if (binarySearchTreeNode.left != null) {
				binarySearchTreeNode = binarySearchTreeNode.left;
			} else if (binarySearchTreeNode.right != null) {
				binarySearchTreeNode = binarySearchTreeNode.right;
			} else {
				binarySearchTreeNode = null;
			}
		}
		return binarySearchTreeNode;
	}

	private BinarySearchTreeNode getMinimumNode(BinarySearchTreeNode binarySearchTreeNode) {
		if (binarySearchTreeNode.left == null) {
			return binarySearchTreeNode;
		}
		return getMinimumNode(binarySearchTreeNode.left);
	}

	public void inOrderTraversal(BinarySearchTreeNode binarySearchTreeNode) {
		if (binarySearchTreeNode == null) {
			return;
		}
		inOrderTraversal(binarySearchTreeNode.left);
		System.out.print(binarySearchTreeNode.value + " ");
		inOrderTraversal(binarySearchTreeNode.right);
	}

	private BinarySearchTreeNode insert(BinarySearchTreeNode binarySearchTreeNode, int value) {
		if (binarySearchTreeNode == null) {
			binarySearchTreeNode = new BinarySearchTreeNode();
			binarySearchTreeNode.value = value;
		} else if (value <= binarySearchTreeNode.value) {
			binarySearchTreeNode.left = insert(binarySearchTreeNode.left, value);
		} else {
			binarySearchTreeNode.right = insert(binarySearchTreeNode.right, value);
		}
		return binarySearchTreeNode;
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public void levelOrderTraversal() {
		Queue<BinarySearchTreeNode> binarySearchTreeNodes = new LinkedList<>();
		binarySearchTreeNodes.add(root);
		while (!binarySearchTreeNodes.isEmpty()) {
			BinarySearchTreeNode binarySearchTreeNode = binarySearchTreeNodes.remove();
			System.out.print(binarySearchTreeNode.value + " ");
			if (binarySearchTreeNode.left != null) {
				binarySearchTreeNodes.add(binarySearchTreeNode.left);
			}
			if (binarySearchTreeNode.right != null) {
				binarySearchTreeNodes.add(binarySearchTreeNode.right);
			}
		}
	}

	public void postOrderTraversal(BinarySearchTreeNode binarySearchTreeNode) {
		if (binarySearchTreeNode == null) {
			return;
		}
		postOrderTraversal(binarySearchTreeNode.left);
		postOrderTraversal(binarySearchTreeNode.right);
		System.out.print(binarySearchTreeNode.value + " ");
	}

	public void preOrderTraversal(BinarySearchTreeNode binarySearchTreeNode) {
		if (binarySearchTreeNode == null) {
			return;
		}
		System.out.print(binarySearchTreeNode.value + " ");
		preOrderTraversal(binarySearchTreeNode.left);
		preOrderTraversal(binarySearchTreeNode.right);
	}

	public void search(BinarySearchTreeNode binarySearchTreeNode, int value) {
		if (binarySearchTreeNode == null) {
			System.out.println("Value " + value + " not found in binary search tree.");
			return;
		}
		if (binarySearchTreeNode.value == value) {
			System.out.println("Value " + value + " found in binary search tree.");
			return;
		}
		if (binarySearchTreeNode.value > value) {
			search(binarySearchTreeNode.left, value);
		} else {
			search(binarySearchTreeNode.right, value);
		}
	}

}