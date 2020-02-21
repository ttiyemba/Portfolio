package com.qa.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram("computer","retupdsmoc"));

	}
	
	public static boolean anagram(String a, String b) {
		a = a.replaceAll(" ", "").toLowerCase();
		b=b.replaceAll(" ", "").toLowerCase();
		
		if(a.length()!=b.length()) {
			
			return false;
		}else {
			List<Character> firstlist = new ArrayList<>();
			List<Character> secondlist = new ArrayList<>();
			
			for(int i =0; i<a.length(); i++) {
				firstlist.add(a.charAt(i));
				secondlist.add(b.charAt(i));
			}
			
			firstlist.sort(null);
			secondlist.sort(null);
			
			return(firstlist.equals(secondlist));
			
		}
	
		
	}

		
	

}
