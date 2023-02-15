package org.base;

public class Factorial2 {
	public static void main(String[] args) {
		int i, fact = 1;
		int num = 6;
		for (i = 1; i < num; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

}
