package com.ub.IteratorA2P1.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.ub.IteratorA2P1.tree.AbsTree;

//***********************  GENERIC TREE ITERATORS ***************************

public class AbsTreeIterator<T extends Comparable<T>> implements Iterator<T> {

	public AbsTreeIterator(AbsTree<T> root) {

		// fill in the code
		stack_left_spine(root);

	}

	public boolean hasNext() {

		// fill in the code
		/*
		 * If spine left is empty and the current node is root then return false else
		 * true
		 */
		return !stack.isEmpty();
	}

	public T next() {

		// fill in the code
		/*
		 * return stack left spine top node and maintain stack left spine empty then
		 * return the current node
		 */
		AbsTree<T> nextValue = null;
		if (!stack.isEmpty()) {
			nextValue = stack.pop();
			if (count < 0) {
				count = nextValue.get_count();
			}
			if (count > 1) {
				count -= 1;
				stack.add(nextValue);
			} else {
				count = -1;
				stack_left_spine(nextValue.getRight());
			}
		}
		return nextValue.getValue();
	}

	private void stack_left_spine(AbsTree<T> node) {
		// fill in the code
		if (node != null) {
			stack.add(node);
			stack_left_spine(node.getLeft());
		}
	}

	private Stack<AbsTree<T>> stack = new Stack<AbsTree<T>>();
	private int count = -1;

//+ any other private fields that you want

}
