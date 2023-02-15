package org.base;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] a = new int[] { 23, 10, 56, 34, 190, 100 };
		System.out.println("Sorting of the Array is :");
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			System.out.println(a[i]);

		}
	}

}
