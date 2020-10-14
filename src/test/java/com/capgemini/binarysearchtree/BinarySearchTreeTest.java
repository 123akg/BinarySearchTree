package com.capgemini.binarysearchtree;

import org.junit.*;

public class BinarySearchTreeTest {
	@Test
	public void given13NumbersWhenAddedToBinaryTreeShouldReturnSize13() {
		BinarySearchTree binarySearchTree = new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(32);
		binarySearchTree.add(86);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(64);
		binarySearchTree.add(95);
		binarySearchTree.add(15);
		binarySearchTree.add(65);
		binarySearchTree.add(30);
		binarySearchTree.add(16);
		binarySearchTree.add(44);
		binarySearchTree.add(75);
		

		int size = binarySearchTree.getSize();
		Assert.assertTrue(size == 13);
	}

}
