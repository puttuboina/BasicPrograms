package org.base;

public class Factorial {
	public static void main(String[] args) {
		int a = 6;
		int fact = 1;
		while (a > 0) {
			fact = fact * a;
			a -= 1;
		}
		System.out.println(fact);

	}

}
