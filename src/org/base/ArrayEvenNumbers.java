package org.base;

public class ArrayEvenNumbers {
	public static void main(String[] args) {
		int[] a = new int[] { 34, 10, 29, 45, 67 };
		System.out.println("Even numbers of the Array:");
		for (int i = 1; i < a.length; i = i + 2) {
			System.out.println(a[i]);

		}
	}

}
