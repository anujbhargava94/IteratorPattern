package com.ub.IteratorA2P1.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.ub.IteratorA2P1.tree.AbsTree;

//***********************  GENERIC TREE ITERATORS ***************************

class AbsTreeIterator<T extends Comparable<T>> implements Iterator<T> {

public AbsTreeIterator(AbsTree<T> root) {
	
	// fill in the code

}

public boolean hasNext() {
	
	// fill in the code

}

public T next() {

	// fill in the code

}

private void stack_left_spine(AbsTree<T> node) {

	// fill in the code
	 
}


private Stack<AbsTree<T>> stack = new Stack<AbsTree<T>>();

//+ any other private fields that you want

}
