package org.base;

public class PrintEvenNumbers {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 90; i++) {
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}

}
