package com.bridgeLabz.dataStructure;

//Binary tree implementation
public class Tree {
	private Node root;

	
	public Tree() {
		this.root = null;
	}

	private class Node {
		private int data;
		private Node leftChild;
		private Node rightChild;

		
		public Node(int data) {
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
	}

	
	public void insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			traverseToAdd(root, newNode);
		}
	}


	private void traverseToAdd(Node current, Node newNode) {
		if (newNode.data < current.data) {
			if (current.leftChild == null) {
				current.leftChild = newNode;
			} else {
				traverseToAdd(current.leftChild, newNode);
			}
		} else if (newNode.data > current.data) {
			if (current.rightChild == null) {
				current.rightChild = newNode;
			} else {
				traverseToAdd(current.rightChild, newNode);
			}
		}
	}


	public void delete(int data) {
		root = deleteAtNode(root, data);
	}


	private Node deleteAtNode(Node root, int data) {
		if (root == null)
			return root;
		if (data < root.data)
			root.leftChild = deleteAtNode(root.leftChild, data);
		else if (data > root.data)
			root.rightChild = deleteAtNode(root.rightChild, data);
		else {
			if (root.leftChild == null)
				return root.rightChild;
			else if (root.rightChild == null)
				return root.leftChild;
		
			root.data = minValue(root.rightChild);
			root.rightChild = deleteAtNode(root.rightChild, root.data);
		}
		return root;
	}


	private int minValue(Node root) {
		int min = root.data;
		while (root.leftChild != null) {
			min = root.leftChild.data;
			root = root.leftChild;
		}
		return min;
	}


	public void inorderDisplay() {
		inorderRecurssion(root);
	}


	private void inorderRecurssion(Node root) {
		if (root != null) {
			inorderRecurssion(root.leftChild);
			System.out.print(root.data + " ");
			inorderRecurssion(root.rightChild);
		}
	}

}