package org.base;

public class StringReverse {
	public static void main(String[] args) {
		String s = "lakshmi prasanna";
		String rev = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
