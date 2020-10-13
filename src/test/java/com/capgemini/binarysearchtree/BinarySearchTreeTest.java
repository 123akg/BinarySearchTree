package com.capgemini.binarysearchtree;

import org.junit.*;

public class BinarySearchTreeTest {
	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		BinarySearchTree binarySearchTree=new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		
		int size=binarySearchTree.getSize();
		Assert.assertTrue(size==3);
	}

}
