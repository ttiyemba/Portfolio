package com.qa.borrowOrRob;

public class Runner {

	public static void main(String[] args) {

		borrowOrRob("robocop");
		// TODO Auto-generated method stub

	}

	public static boolean borrowOrRob(String sentence) {

		String newSetence = sentence.replaceAll("\\s+", "").toLowerCase();
		String reverse = "";

		for (int i = newSetence.length() - 1; i >= 0; i--) {

			reverse += newSetence.charAt(i);

		}
		if(newSetence.equals(reverse)) {
			return true;
		}else {
			return false;
		}
		

	}

}
