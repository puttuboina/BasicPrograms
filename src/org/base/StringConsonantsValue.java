package org.base;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringConsonantsValue {
	public static void main(String[] args) {
		String s = "lakshmi prasanna";
		char[] ch = s.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U')) {
					if (m.containsKey(c)) {
						Integer integer = m.get(ch[i]);
						m.put(c, integer + 1);
					} else {
						m.put(c, 1);
					}
				}
			}
		}
		Set<Entry<Character, Integer>> a = m.entrySet();
		for (Entry<Character, Integer> d : a) {
			System.out.println(d);
		}
	}
}
