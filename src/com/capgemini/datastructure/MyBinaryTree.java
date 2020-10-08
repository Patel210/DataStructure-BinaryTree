package com.capgemini.datastructure;

public class MyBinaryTree<K extends Comparable<K>> {
	MyBinaryNode<K> root;

	/**
	 * @param key To add a key to the structure
	 */
	public void add(K key) {
		if (root == null) {
			this.root = new MyBinaryNode<K>(key);
		} else {
			addKeyAtAppropriateNode(root, key);
		}
	}

	/**
	 * @param pointer
	 * @param key     Recursively trying to get the appropriate location to add the
	 *                key
	 */
	private void addKeyAtAppropriateNode(MyBinaryNode<K> pointer, K key) {
		if (pointer.key.compareTo(key) == 1) {
			if (pointer.left == null) {
				pointer.left = new MyBinaryNode(key);
			} else {
				addKeyAtAppropriateNode(pointer.left, key);
			}
		}
		if (pointer.key.compareTo(key) == -1) {
			if (pointer.right == null) {
				pointer.right = new MyBinaryNode(key);
			} else {
				addKeyAtAppropriateNode(pointer.right, key);
			}
		}
	}

	/**
	 * @return Returns the size of the tree
	 */
	public int size() {
		return myTreeSize(root);
	}

	/**
	 * @param pointer
	 * @return recursively counting the tree size
	 */
	private int myTreeSize(MyBinaryNode<K> pointer) {
		return (pointer == null) ? 0 : 1 + myTreeSize(pointer.left) + myTreeSize(pointer.right);
	}
}
