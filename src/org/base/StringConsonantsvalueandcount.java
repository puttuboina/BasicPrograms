package org.base;

import java.util.Scanner;

public class StringConsonantsvalueandcount {
	public static void main(String[] args) {
		String s = "lakshmi prasanna";
		int Vcount = 0, Ccount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("String is:");
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println(" "+s.charAt(i));
				Vcount++;
			} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				Ccount++;
			}
		}
		System.out.println("No of vowels in the String is :" + Ccount);
		System.out.println("No of consonants in the String is:" + Vcount);

	}

}
