package com.bsttoskewed.driverclass;

import com.bsttoskewed.binarytorightskewedalgo.BinarySearchTree;

public class BinaryToRightSkewedDriverClass {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		// BinaryToRightSkewed skewed = new BinaryToRightSkewed();

		bst.insert(50);
		bst.insert(30);
		bst.insert(60);
		bst.insert(10);
		bst.insert(55);

		/***
		 * To display in-order traversal of BST
		 */
		System.out.println("**********************************");
		bst.inOrder();
		/***
		 * The output will be in the form of actual tree, where all the left of the tree
		 * is null
		 * and the right will be in the increasing order
		 * the algorithm to convert from BST is inside Binary Search Tree
		 * with Function Name = toRightSkewed()
		 */
		System.out.println("***********************************");
		bst.toRightSkewedTraversal(); //

	}

}
