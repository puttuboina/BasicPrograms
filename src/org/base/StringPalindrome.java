package org.base;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "lakshmi prasanna";
		String rev = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
	}

}
