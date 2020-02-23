package com.qa.isPalindrome;

public class Runner {
	public static void main(String[] args) {
		
	}
	
	public static boolean isPalindrome(String s) {


        String format = s.replaceAll("\\W", "").toLowerCase();


        StringBuilder reversed = new StringBuilder();
        reversed.append(format).reverse();


        return reversed.toString().equals(format);

    }

}
