package com.capgemini.datastructure;

public interface INode<K> {
	K getKey();

	void setKey(K key);

	INode<K> getLeft();

	void setLeft(INode<K> left);
	
	INode<K> getRight();

	void setRight(INode<K> right);
}
