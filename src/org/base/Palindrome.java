package org.base;

public class Palindrome {
	public static void main(String[] args) {
		int a, temp, sum = 0;
		int n = 34890;
		temp = n;
		while (n > 0) {
			a = n % 10;
			sum = sum * 10 + n;
			n /= 10;
		}
		if (sum == temp) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}

	}

}
