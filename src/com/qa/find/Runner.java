package com.qa.find;

public class Runner {

	public static void main(String[] args) {

		System.out.println(find("hello", 2, 'e'));
		System.out.println(find("trash", 4, 'a'));
		System.out.println(find("trash", 4, 's'));

	}

	public static boolean find(String s, int i, char c) {

		if (s.charAt(i - 1) == c) {

			return true;
		} else {
			return false;
		}

	}

}
