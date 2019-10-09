package com.ub.IteratorA2P1.main;

import java.util.*;
//	CONTENTS OF THIS FILE:
//
//1. Class GenericIterators, with methods:
//
//- main()
//- test1() ... test4()
//- print()
//- disjoint() and contains()
//
//(only disjoint and contains require coding)
//
//2. Generic classes AbsTreeIterator, TreeIterator, DupTreeIterator	
//
//- complete the outline of AbsTreeIterator
//- no changes needed for TreeIterator and DupTreeIterator
//
//3. Generic classes AbsTree, Tree, and DupTree
//
//- no changes are required for these three classes
//************************************************************

public class GenericIterators {

	public static void main(String[] args) {

		test1();
		System.out.println();
		test2();
		System.out.println();
		test3();
		System.out.println();
		test4();
	}

//DON'T MODIFY test1() .. test4() METHODS

	static void test1() {

		AbsTree<Integer> set1 = new Tree<Integer>(101);
		set1.insert(151);
		set1.insert(126);
		set1.insert(51);
		set1.insert(51);
		set1.insert(21);
		set1.insert(22);
		set1.insert(23);
		set1.insert(76);
		set1.insert(77);
		set1.insert(151);
		set1.insert(126);
		set1.insert(201);

		AbsTree<Integer> set2 = new Tree<Integer>(100);
		set2.insert(50);
		set2.insert(50);
		set2.insert(25);
		set2.insert(75);
		set2.insert(75);
		set2.insert(150);
		set2.insert(125);
		set2.insert(200);
		set2.insert(100);

		System.out.print("set1 = ");
		print(set1);
		System.out.print("set2 = ");
		print(set2);

		if (disjoint(set1, set2))
			System.out.println("set1 and set2 are disjoint.");
		else
			System.out.println("set1 and set2 are not disjoint.");
	}

	static void test2() {

		AbsTree<Integer> bag1 = new DupTree<Integer>(100);
		bag1.insert(150);
		bag1.insert(125);
		bag1.insert(51);
		bag1.insert(51);
		bag1.insert(31);
		bag1.insert(32);
		bag1.insert(33);
		bag1.insert(79);
		bag1.insert(79);
		bag1.insert(79);
		bag1.insert(150);
		bag1.insert(125);
		bag1.insert(200);

		AbsTree<Integer> bag2 = new DupTree<Integer>(100);
		bag2.insert(50);
		bag2.insert(50);
		bag2.insert(25);
		bag2.insert(75);
		bag2.insert(75);
		bag2.insert(150);
		bag2.insert(125);
		bag2.insert(200);
		bag2.insert(100);

		System.out.print("bag1 = ");
		print(bag1);
		System.out.print("bag2 = ");
		print(bag2);

		if (disjoint(bag1, bag2))
			System.out.println("bag1 and bag2 are disjoint.");
		else
			System.out.println("bag1 and bag2 are not disjoint.");
	}

	static void test3() {

		AbsTree<Integer> set1 = new Tree<Integer>(100);
		set1.insert(150);
		set1.insert(125);
		set1.insert(50);
		set1.insert(50);
		set1.insert(25);
		set1.insert(126);
		set1.insert(75);
		set1.insert(76);
		set1.insert(150);
		set1.insert(125);
		set1.insert(151);
		set1.insert(201);

		AbsTree<Integer> set2 = new Tree<Integer>(100);
		set2.insert(50);
		set2.insert(50);
		set2.insert(25);
		set2.insert(75);
		set2.insert(75);
		set2.insert(150);
		set2.insert(125);
		set2.insert(200);
		set2.insert(100);

		System.out.print("set1 = ");
		print(set1);
		System.out.print("set2 = ");
		print(set2);

		if (contains(set1, set2))
			System.out.println("set1 contains set2.");
		else
			System.out.println("set1 does not contain set2.");
	}

	static void test4() {

		AbsTree<Integer> bag1 = new DupTree<Integer>(100);
		bag1.insert(150);
		bag1.insert(125);
		bag1.insert(50);
		bag1.insert(50);
		bag1.insert(26);
		bag1.insert(25);
		bag1.insert(27);
		bag1.insert(75);
		bag1.insert(75);
		bag1.insert(76);
		bag1.insert(150);
		bag1.insert(125);
		bag1.insert(200);

		AbsTree<Integer> bag2 = new DupTree<Integer>(100);
		bag2.insert(50);
		bag2.insert(50);
		bag2.insert(25);
		bag2.insert(75);
		bag2.insert(75);
		bag2.insert(150);
		bag2.insert(125);
		bag2.insert(200);
		bag2.insert(100);

		System.out.print("bag1 = ");
		print(bag1);
		System.out.print("bag2 = ");
		print(bag2);

		if (contains(bag1, bag2))
			System.out.println("bag1 contains bag2.");
		else
			System.out.println("bag1 does not contain bag2.");
	}

	static void print(AbsTree<Integer> bs) {
		System.out.print("{ ");
		for (int x : bs)
			System.out.print(x + " ");
		System.out.println("}");
	}

	static <T extends Comparable<T>> boolean disjoint(AbsTree<T> tr1, AbsTree<T> tr2) {
		Iterator<T> iter1 = tr1.iterator();
		Iterator<T> iter2 = tr2.iterator();

// ********** fill in code here **************
		boolean areDisjoint = true;
		T next1 = null;
		T next2 = null;
		if (iter1.hasNext() && iter2.hasNext()) {		//Getting the initial elements
			next1 = iter1.next();
			next2 = iter2.next();
		}
		while (true) {
			if (next1.compareTo(next2) == 0) { 		//If at any point elements matches exit the loop
				areDisjoint = false;
				break;
			} else if (next1.compareTo(next2) > 0) {   // If tr1 element is greater than the tr2 element than find next element of tr2
				if (iter2.hasNext()) {
					next2 = iter2.next();
				} else {
					break;
				}
			} else {								// If tr2 element is greater than the tr1 element than find next element of tr1
				if (iter1.hasNext()) {
					next1 = iter1.next();
				} else {
					break;
				}
			}
		}
		return areDisjoint;
	}

	static <T extends Comparable<T>> boolean contains(AbsTree<T> tr1, AbsTree<T> tr2) {
		Iterator<T> iter1 = tr1.iterator();
		Iterator<T> iter2 = tr2.iterator();

// *********** fill in code here *************
		boolean doesContain = true;
		T next1 = null;
		T next2 = null;

		if (iter1.hasNext() && iter2.hasNext()) {   //Getting the initial elements from the trees
			next1 = iter1.next();
			next2 = iter2.next();
		}
		while (true) {
			if (next1.compareTo(next2) < 0) {     //<0 means element in tr1 is less than tr2 element Hence iterating tr1 till it matches tr2 element

				if (iter1.hasNext()) {
					next1 = iter1.next();
				} else {
					doesContain = false;
					break;
				}
			} else if (next1.compareTo(next2) == 0) {        // If element found then iterate through both trees simultaneously
				if (iter1.hasNext() && iter2.hasNext()) {
					next1 = iter1.next();
					next2 = iter2.next();
				} else if (iter2.hasNext()) {				//tr2 still has element and tr1 is empty means tr2 has extra elements
					doesContain = false;
					break;
				} else {
					break;
				}
			} else {										// At any point element doesn't match exit the loop
				doesContain = false;
				break;
			}
		}
		return doesContain;
	}

}

//***********************  GENERIC TREE ITERATORS ***************************

class AbsTreeIterator<T extends Comparable<T>> implements Iterator<T> {

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
		 * return stack left spine top node and maintain stack left spine if it's empty
		 * then return the current node
		 */
		AbsTree<T> nextValue = null;
		if (!stack.isEmpty()) {
			nextValue = stack.pop();
			if (count < 0) {      					//count<0 means node popped for first time and count is not initialised
				count = nextValue.get_count();
			}
			if (count > 1) {						//non -zero count of nodes have been popped hence decreasing the count and reinserting
				count -= 1;							//node in stack because node still has multiple counts available to be popped
				stack.add(nextValue);
			} else {								//No more count of node is present has visiting the right subtree
				count = -1;
				stack_left_spine(nextValue.right);
			}
		}
		return nextValue.value;
	}

	private void stack_left_spine(AbsTree<T> node) {
		// fill in the code
		if (node != null) {
			stack.add(node);
			stack_left_spine(node.left);
		}
	}

	private Stack<AbsTree<T>> stack = new Stack<AbsTree<T>>();
	private int count = -1;

//+ any other private fields that you want

}

//NO CHANGES NEEDED FOR TreeIterator<T> and DupTreeIterator<T>

class TreeIterator<T extends Comparable<T>> extends AbsTreeIterator<T> {
	public TreeIterator(AbsTree<T> t) {
		super(t);
	}
}

class DupTreeIterator<T extends Comparable<T>> extends AbsTreeIterator<T> {
	public DupTreeIterator(AbsTree<T> t) {
		super(t);
	}
}

//****************** GENERIC ABSTREE, TREE, AND DUPTREE ********************

abstract class AbsTree<T extends Comparable<T>> implements Iterable<T> {

	public AbsTree(T v) {
		value = v;
		left = null;
		right = null;
	}

	public void insert(T v) {
		if (value.compareTo(v) == 0)
			count_duplicates();
		if (value.compareTo(v) > 0)
			if (left == null)
				left = add_node(v);
			else
				left.insert(v);
		else if (value.compareTo(v) < 0)
			if (right == null)
				right = add_node(v);
			else
				right.insert(v);
	}

	public Iterator<T> iterator() {
		return create_iterator();
	}

	protected abstract AbsTree<T> add_node(T n);

	protected abstract void count_duplicates();

	protected abstract int get_count();

	protected abstract Iterator<T> create_iterator();

	protected T value;
	protected AbsTree<T> left;
	protected AbsTree<T> right;
}

class Tree<T extends Comparable<T>> extends AbsTree<T> {
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

	protected int get_count() {
		return 1;
	}
}

class DupTree<T extends Comparable<T>> extends AbsTree<T> {
	public DupTree(T n) {
		super(n);
		count = 1;
	};

	public Iterator<T> create_iterator() {
		return new AbsTreeIterator<T>(this); // to do
	}

	protected AbsTree<T> add_node(T n) {
		return new DupTree<T>(n);
	}

	protected void count_duplicates() {
		count++;
	}

	protected int get_count() {
		return count;
	}

	protected int count;
}
