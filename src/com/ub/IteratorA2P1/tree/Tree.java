package com.ub.IteratorA2P1.tree;

import java.util.Iterator;

import com.ub.IteratorA2P1.iterator.AbsTreeIterator;

public class Tree<T extends Comparable<T>> extends AbsTree<T> {
	public Tree(T n) {
		super(n);
	}
	
	public Iterator<T> create_iterator() {
		return new AbsTreeIterator<T>(this);
	}

	protected AbsTree<T> add_node(T n) {
		return new Tree<T>(n);
	}

	protected void count_duplicates() {
		;
	}
	
	public int get_count() {
		return 1;
	}
}
