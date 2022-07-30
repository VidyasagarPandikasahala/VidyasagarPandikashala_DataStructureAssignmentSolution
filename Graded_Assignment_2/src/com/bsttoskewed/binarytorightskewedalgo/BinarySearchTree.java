package com.bsttoskewed.binarytorightskewedalgo;

public class BinarySearchTree {
	public Node root;

	Node current = null; // dummy node for storing the left node n right node value of the BST
	// BinaryToRightSkewed provide = new BinaryToRightSkewed();

	public class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	public BinarySearchTree() {
		this.root = null;
	}

	public void insert(int key) {
		root = insertKey(root, key);
	}

	/***
	 * Here the Binary Search tree is created
	 * 
	 * @param default root(this.root)
	 * @param key     is the value to be added
	 * @return root is returned
	 */
	public Node insertKey(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.data) {
			root.left = insertKey(root.left, key);
		}

		else if (key > root.data) {
			root.right = insertKey(root.right, key);
		}

		return root;
	}

	/***
	 * Here the in order display function is written
	 */
	public void inOrder() {
		System.out.println("Inorder Traversal for BST is");
		inOrderDisplay(this.root);
		System.out.println();

	}

	public void inOrderDisplay(Node root) {
		if (root != null) {
			inOrderDisplay(root.left);

			System.out.print(root.data + " ");
			inOrderDisplay(root.right);
		}
	}

	/***
	 * From the formed BST through in order traversal right skewed tree is formed
	 * 
	 * @return
	 */
	public Node toRightSkewed() {

		if (root == null) { // if there is no input provided then return i.e., move out of the function
			return null;
		}

		/***
		 * // new node with default value zero is created as res
		 * node Res is where all the value in BST is stored
		 */
		Node res = new Node(0);
		current = res;
		rightSkewedSearchTree(this.root);

		/***
		 * // since the res value is zero only the right of the res value is considered
		 * the starting root of the right skewed tree
		 */

		return res.right;
	}

	public void rightSkewedSearchTree(Node root) {
		if (root == null) {
			return;
		} else if (root != null) {

			rightSkewedSearchTree(root.left);// Right of BST is traversed recursively
			root.left = null; // left node is made null
			current.right = root;// here the root is made the current node of right
			current = root;// and the current node will be root node
			rightSkewedSearchTree(root.right);// Right of BST is traversed recursively

		}

	}

	public void toRightSkewedTraversal() {

		System.out.println("Inorder Traversal for Right Skewed is ");
		actualRightSkewedTraversalDisplay(toRightSkewed());
		System.out.println();

	}

	public void actualRightSkewedTraversalDisplay(Node root) {
		if (root == null) {
			System.out.print(" Null ---> ");
		} else {
			actualRightSkewedTraversalDisplay(root.left);
			System.out.print(root.data + "---> ");
			actualRightSkewedTraversalDisplay(root.right);

		}

	}

}
