package com.ub.IteratorA2P1.tree;

import java.util.Iterator;

import com.ub.IteratorA2P1.iterator.AbsTreeIterator;

public class DupTree<T extends Comparable<T>> extends AbsTree<T> {
	public DupTree(T n) {
		super(n);
		count = 1;
	};

	public Iterator<T> create_iterator() {
		return new AbsTreeIterator<T>(this);   // to do
	}
	
	protected AbsTree<T> add_node(T n) {
		return new DupTree<T>(n);
	}

	protected void count_duplicates() {
		count++;
	}
	
	public int get_count() {
		return count;
	}
	
	protected int count;
}
