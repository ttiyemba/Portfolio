package com.qa.unique;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		unique2("jhksdfsdfd");

	}
	
	public static String unique(String setence) {
		
		Set<Character> uniqueLetterList = new LinkedHashSet<Character>();
		
		String uniqueLetter = "";
		
		for(int i =0; i<setence.length(); i++) {
			uniqueLetterList.add(setence.charAt(i));
		}
		
		for(char C: uniqueLetterList) {
			uniqueLetter = uniqueLetter + C;
		}
		return "";
	}
	
	public static String unique2(String setence) {
		return Arrays.asList(setence.split("")).stream().distinct().collect(Collectors.joining(""));
	}

}