package com.easy;

import java.util.Arrays;

public class Median {

	public static int[] a = { 0, 0 };

	public static int[] b = {};

	static private void median() {

		int a1 = a.length;
		int b1 = b.length;
		if (b1 > 0 || a1>0) {
			int c1 = a1 + b1;

			// Creating a new array
			int[] c = new int[c1];

			// Loop to store the elements of first
			// array into resultant array
			for (int i = 0; i < a1; i = i + 1) {
				// Storing the elements in
				// the resultant array
				c[i] = a[i];
			}

			// Loop to concat the elements of second
			// array into resultant array
			for (int i = 0; i < b1; i = i + 1) {

				// Storing the elements in the
				// resultant array
				c[a1 + i] = b[i];
			}

			System.out.println(Arrays.toString(c));

			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a.length; j++) {

					if (c[j] > c[j + 1]) {

						int temp = c[j];
						c[j] = c[j + 1];
						c[j + 1] = temp;

					}

				}

			}
			System.out.println(Arrays.toString(c));

			int avg = 0;
			for (int i : c) {

				avg = avg + i;

			}
//	System.out.println(avg);

			if (avg > 0) {
				double F = c.length;
				System.out.println(F);
				double median;
				if (c.length % 2 != 0) {
					median = (c.length + 1) / 2;

				} else {
					double total = (F / 2) + ((F / 2) + 1);

					median = total / 2;
					System.out.println(total);
				}

				System.out.println(median);

			}

			else {

				System.out.println(0);
			}

		}
		
		else {
			
		}

	}

	public static void main(String[] args) {
		median();

	}

}
