package org.base;

public class ArrayDuplicates2 {
	public static void main(String[] args) {
		int[] a = new int[] { 23, 23, 45, 12, 45, 67, 89 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}

			}

		}
	}

}
