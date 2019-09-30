package com.ub.IteratorA2P1.iterator;

import com.ub.IteratorA2P1.tree.AbsTree;

class TreeIterator<T extends Comparable<T>> extends AbsTreeIterator<T> {
	public TreeIterator(AbsTree<T> t) {
		super(t);
	}
}
