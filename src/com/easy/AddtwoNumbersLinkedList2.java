package com.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AddtwoNumbersLinkedList2 {
	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<>();

		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);

		int sum1 = 0;
		ListIterator<Integer> lite1 = l1.listIterator();
		System.out.println("Backward Direction Iteration:");
		while (lite1.hasNext()) {
			lite1.next();

		}
		while (lite1.hasPrevious()) {
			Integer previous = lite1.previous();
			sum1 = sum1 * 10 + previous;
		}
		System.out.println(sum1);
//		

		List<Integer> l2 = new LinkedList<>();
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		int sum2 = 0;
		ListIterator<Integer> lite2 = l2.listIterator();
		System.out.println("Backward Direction Iteration:");
		while (lite2.hasNext()) {
			lite2.next();

		}
		while (lite2.hasPrevious()) {
			Integer previous2 = lite2.previous();
			sum2 = sum2 * 10 + previous2;
		}
		System.out.println(sum2);

		int c = sum1 + sum2;
		System.out.println(c);

		List<Integer> l3 = new LinkedList<>();

		while (c > 0) {
			l3.add(c % 10);

			c = c / 10;

		}

		for (Integer kk : l3) {
			System.out.println(kk);
		}
	}

}
