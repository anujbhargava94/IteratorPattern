package com.ub.IteratorA2P1.iterator;

import com.ub.IteratorA2P1.tree.AbsTree;

class DupTreeIterator<T extends Comparable<T>> extends AbsTreeIterator<T> {
	public DupTreeIterator(AbsTree<T> t) {
		super(t);
	}
}
