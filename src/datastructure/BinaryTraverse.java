package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTraverse {

	private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	private static List<Node> nodeList = null;

	/**
	 * �ڲ��ࣺ�ڵ�
	 * 
	 */
	private static class Node {
		Node leftChild;
		Node rightChild;
		int data;

		Node(int newData) {
			leftChild = null;
			rightChild = null;
			data = newData;
		}
	}

	public void createBinTree() {
		nodeList = new LinkedList<Node>();
		// ��һ�������ֵ����ת��ΪNode�ڵ�
		for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
			nodeList.add(new Node(array[nodeIndex]));
		}
		// ��ǰlastParentIndex-1�����ڵ㰴�ո��ڵ��뺢�ӽڵ�����ֹ�ϵ����������
		for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
			// ����
			nodeList.get(parentIndex).leftChild = nodeList
					.get(parentIndex * 2 + 1);
			// �Һ���
			nodeList.get(parentIndex).rightChild = nodeList
					.get(parentIndex * 2 + 2);
		}
		// ���һ�����ڵ�:��Ϊ���һ�����ڵ����û���Һ��ӣ����Ե����ó�������
		int lastParentIndex = array.length / 2 - 1;
		// ����
		nodeList.get(lastParentIndex).leftChild = nodeList
				.get(lastParentIndex * 2 + 1);
		// �Һ���,�������ĳ���Ϊ�����Ž����Һ���
		if (array.length % 2 == 1) {
			nodeList.get(lastParentIndex).rightChild = nodeList
					.get(lastParentIndex * 2 + 2);
		}
	}

	/**
	 * �������
	 * 
	 * �����ֲ�ͬ�ı����ṹ����һ���ģ�ֻ���Ⱥ�˳��һ������
	 * 
	 * @param node
	 *            �����Ľڵ�
	 */
	public static void preOrderTraverse(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrderTraverse(node.leftChild);
		preOrderTraverse(node.rightChild);
	}

	/**
	 * �������
	 * 
	 * �����ֲ�ͬ�ı����ṹ����һ���ģ�ֻ���Ⱥ�˳��һ������
	 * 
	 * @param node
	 *            �����Ľڵ�
	 */
	public static void inOrderTraverse(Node node) {
		if (node == null)
			return;
		inOrderTraverse(node.leftChild);
		System.out.print(node.data + " ");
		inOrderTraverse(node.rightChild);
	}

	/**
	 * �������
	 * 
	 * �����ֲ�ͬ�ı����ṹ����һ���ģ�ֻ���Ⱥ�˳��һ������
	 * 
	 * @param node
	 *            �����Ľڵ�
	 */
	public static void postOrderTraverse(Node node) {
		if (node == null)
			return;
		postOrderTraverse(node.leftChild);
		postOrderTraverse(node.rightChild);
		System.out.print(node.data + " ");
	}

	/**
	 * �������
	 * 
	 * �����ֲ�ͬ�ı����ṹ����һ���ģ�ֻ���Ⱥ�˳��һ������
	 * 
	 * @param node
	 *            �����Ľڵ�
	 */
	public static void levelOrderTraverse(Node node) {
		if (node == null)
			return;
		List<Node> list = new ArrayList<Node>();
		List<Integer> data = new ArrayList<Integer>();
		list.add(node);
		while (true) {
			if (list.isEmpty())
				break;
			List<Node> nextLayer = new ArrayList<Node>();
			for (Node node0 : list) {
				data.add(node0.data);
				if (node0.leftChild != null)
					nextLayer.add(node0.leftChild);
				if (node0.rightChild != null)
					nextLayer.add(node0.rightChild);
			}
			list = nextLayer;
		}
		for (Integer num : data)
			System.out.print(num + " ");
	}

	public static void main(String[] args) {
		BinaryTraverse binTree = new BinaryTraverse();
		binTree.createBinTree();
		// nodeList�е�0����������ֵ��Ϊ���ڵ�
		Node root = nodeList.get(0);

		System.out.print("���������");
		preOrderTraverse(root);
		System.out.println();

		System.out.print("���������");
		inOrderTraverse(root);
		System.out.println();

		System.out.print("���������");
		postOrderTraverse(root);
		System.out.println();

		System.out.print("���������");
		levelOrderTraverse(root);
	}
}