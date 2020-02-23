package com.qa.removeVowels;

import java.util.HashSet;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeVowel("thegreatwhiteshark"));

	}
	
	
	public static String removeVowel(String s) {
		
		
		Set<Character> vowels = new HashSet<>();
		
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		StringBuilder results = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(!vowels.contains(c)) {
				results.append(c);
			}
		}
		return results.toString();
		
	}

}
