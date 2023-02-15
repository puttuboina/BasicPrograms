package org.base;

public class Primenumbers {
	public static void main(String[] args) {
		int a = 90;
		int count = 0;
		for (int i = 0; i < a / 2; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("it is prime number");
		} else {
			System.out.println("it is not prime number");
		}
	}

}
