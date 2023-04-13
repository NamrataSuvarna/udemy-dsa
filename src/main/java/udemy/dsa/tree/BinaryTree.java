package udemy.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public BinaryTreeNode root;

	public BinaryTree() {
	}

	public void inOrderTraversal(BinaryTreeNode binaryTreeNode) {
		if (binaryTreeNode == null) {
			return;
		}
		inOrderTraversal(binaryTreeNode.left);
		System.out.print(binaryTreeNode.value + " ");
		inOrderTraversal(binaryTreeNode.right);
	}

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

	public void postOrderTraversal(BinaryTreeNode binaryTreeNode) {
		if (binaryTreeNode == null) {
			return;
		}
		postOrderTraversal(binaryTreeNode.left);
		postOrderTraversal(binaryTreeNode.right);
		System.out.print(binaryTreeNode.value + " ");
	}

	public void preOrderTraversal(BinaryTreeNode binaryTreeNode) {
		if (binaryTreeNode == null) {
			return;
		}
		System.out.print(binaryTreeNode.value + " ");
		preOrderTraversal(binaryTreeNode.left);
		preOrderTraversal(binaryTreeNode.right);
	}

}