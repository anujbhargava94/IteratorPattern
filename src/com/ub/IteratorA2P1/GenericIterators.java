package com.ub.IteratorA2P1;

import java.util.Iterator;

import com.ub.IteratorA2P1.tree.AbsTree;
import com.ub.IteratorA2P1.tree.DupTree;
import com.ub.IteratorA2P1.tree.Tree;

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
	}

	static <T extends Comparable<T>> boolean contains(AbsTree<T> tr1, AbsTree<T> tr2) {
		Iterator<T> iter1 = tr1.iterator();
		Iterator<T> iter2 = tr2.iterator();

// *********** fill in code here *************
	}

}