package org.base;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int a = 3486, remainder, result = a, orgnum;
		orgnum = a;
		while (orgnum != 0) {
			remainder = orgnum % 10;
			result += Math.pow(remainder, 3);
			orgnum /= 10;
		}
		if (result == a) {
			System.out.println("it is armstrong");
		} else {
			System.out.println("it is not armstrong");
		}
	}

}
