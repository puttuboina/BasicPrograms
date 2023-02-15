package org.base;

public class StringUppercase {
	public static void main(String[] args) {
		String s = "lakshmi prasanna";
		String s2 = " ";
		String s3[] = s.split(" ");
		for (String s4 : s3) {
			char a = s4.charAt(0);
			char b = Character.toUpperCase(a);
			String c = s4.substring(1);
			s2 = s2 + b + c + " ";

		}
		System.out.println(s2);
	}

}
