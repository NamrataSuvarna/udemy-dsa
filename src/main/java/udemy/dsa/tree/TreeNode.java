package udemy.dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	public List<TreeNode> children;

	public String data;

	public TreeNode(String data) {
		this.children = new ArrayList<>();
		this.data = data;
	}

	public void addChild(TreeNode treeNode) {
		this.children.add(treeNode);
	}

	public String print(int level) {
		String returnValue = "  ".repeat(level) + this.data + "\n";
		for (TreeNode treeNode : this.children) {
			returnValue = returnValue + treeNode.print(level + 1);
		}
		return returnValue;
	}

}