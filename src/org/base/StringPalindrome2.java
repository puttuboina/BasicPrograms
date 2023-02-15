package org.base;

import java.util.Scanner;

public class StringPalindrome2 {
	public static void main(String[] args) {
		String s = " ";
		String org = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("String is : ");
		s = sc.next();
		int length = 1;
		for (int i = s.length(); i >= 0; i--) {
			org = org + s.charAt(i);
		}
		if (s.equals(org)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}

	}
}
