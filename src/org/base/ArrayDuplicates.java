package org.base;

import java.util.Set;
import java.util.TreeSet;

public class ArrayDuplicates {
	public static void main(String[] args) {
		int[] a = new int[] { 23, 13, 23, 45, 12, 45, 67 };
		Set<Integer> s = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		for (Integer d : s) {
			System.out.println(d);
		}
	}

}
