package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		TreeNode r1 = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);
		TreeNode r3 = new TreeNode(3);
		TreeNode r4 = new TreeNode(4);
		TreeNode r5 = new TreeNode(5);
		TreeNode r6 = new TreeNode(6);
		root.left = r1;
		root.right = r2;
		r1.left = r3;
		r3.left = r4;
		r3.right = r5;
		r2.right = r6;
		
		
		BinaryTree tree = new BinaryTree();
		int count = tree.getNumNodeRec(root);
		count = tree.getNumNode(root);
		System.out.println("结点个数：" + count);
		
		count = tree.getDepthRec(root);
		count = tree.getDepth(root);
		System.out.println("树的深度：" + count);
		
	}

	/**
	 *  求二叉树中的节点个数递归解法： O(n) 
	 * （1）如果二叉树为空，节点个数为0 
	 * （2）如果二叉树不为空，二叉树节点个数 = 左子树节点个数+右子树节点个数 + 1      
	 */
	public int getNumNodeRec(TreeNode root) {
		if(root == null)
			return 0;
		else
			return getNumNodeRec(root.left) + getNumNodeRec(root.right) + 1;
	}
	
	/**
	 * 求二叉树中的节点个数迭代解法O(n)：基本思想同LevelOrderTraversal，
	 * 即用一个Queue，在Java里面可以用LinkedList来模拟
	 */
	public int getNumNode(TreeNode root) {
		if (root == null)
			return 0;
		int count = 1;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode current = queue.remove();
			if (current.left != null) {
				queue.add(current.left);
				count++;
			}
			if (current.right != null) {
				queue.add(current.right);
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 求二叉树的深度（高度） 递归解法： O(n)
	 * （1）如果二叉树为空，二叉树的深度为0
	 * （2）如果二叉树不为空，二叉树的深度 = max(左子树深度， 右子树深度) + 1   
	 */
	public int getDepthRec(TreeNode root){
		if(root == null)
			return 0;
		int leftDepth = getDepthRec(root.left);
		int rightDepth = getDepthRec(root.right);
		return Math.max(leftDepth, rightDepth) + 1;
	}
	/** 
	 * 求二叉树的深度（高度） 迭代解法： O(n)
	 * 基本思想同LevelOrderTraversal，还是用一个Queue
	 */
	public int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int depth = 0;
		int currentLevelNodes = 1;
		int nextLevelNodes = 0;
		while (!queue.isEmpty()) {
			TreeNode current = queue.remove();
			currentLevelNodes--;
			if (current.left != null) {
				queue.add(current.left);
				nextLevelNodes++;
			}
			if (current.right != null) {
				queue.add(current.right);
				nextLevelNodes++;
			}

			if (currentLevelNodes == 0) {
				currentLevelNodes = nextLevelNodes;
				nextLevelNodes = 0;
				depth++;
			}
		}
		return depth;
	}
	
}

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}