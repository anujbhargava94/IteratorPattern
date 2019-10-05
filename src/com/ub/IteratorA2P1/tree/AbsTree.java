package com.ub.IteratorA2P1.tree;

import java.util.Iterator;

//****************** GENERIC ABSTREE, TREE, AND DUPTREE ********************

public abstract class AbsTree<T extends Comparable<T>> implements Iterable<T> {

	public AbsTree(T v) {
		setValue(v);
		setLeft(null);
		setRight(null);
	}

	public void insert(T v) {
		if (getValue().compareTo(v) == 0)
			count_duplicates();
		if (getValue().compareTo(v) > 0)
			if (getLeft() == null)
				setLeft(add_node(v));
			else
				getLeft().insert(v);
		else if (getValue().compareTo(v) < 0)
			if (getRight() == null)
				setRight(add_node(v));
			else
				getRight().insert(v);
	}

	public Iterator<T> iterator() {
		return create_iterator();
	}

	protected abstract AbsTree<T> add_node(T n);

	protected abstract void count_duplicates();

	public abstract int get_count();
	

	protected abstract Iterator<T> create_iterator();

	public AbsTree<T> getRight() {
		return right;
	}

	public void setRight(AbsTree<T> right) {
		this.right = right;
	}

	private T value;
	private AbsTree<T> left;
	private AbsTree<T> right;

	public AbsTree<T> getLeft() {
		return left;
	}

	public void setLeft(AbsTree<T> left) {
		this.left = left;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
