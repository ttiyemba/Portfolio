package com.qa.borrowOrRob;

public class Runner {

	public static void main(String[] args) {

		borrowOrRob("racecar");
		// TODO Auto-generated method stu
		borrow("robocop");

	}

	public static  boolean borrowOrRob(String sentence) {

		String newSetence = sentence.replaceAll("\\s+", "").toLowerCase();
		String reverse = "";

		for (int i = newSetence.length() - 1; i >= 0; i--) {

			reverse += newSetence.charAt(i);
			

		}
		System.out.println(newSetence.equals(reverse));
		return newSetence.equals(reverse);
		
			
	
		

	}
	public static boolean borrow(String sentence) {
		String s = sentence.replaceAll("\\s+", "").toLowerCase();
		
		int i = 0;
		int j = s.length() - 1;
		
		while (i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				System.out.println("false");
				return false;
				
			
			}
			i++;
			j--;
			
		}System.out.println("true");
		return true;
	}

}
