package com.qa.armstrong;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		armstrong(370);

	}
	
	static List<Integer> armstrong(int maxNum){
		
		List<Character> numList = new ArrayList<>();
		int cubed = 0;
		
		String num = Integer.toString(maxNum);
		
		for(int i = 0; i<num.length(); i++) {
			
			numList.add(num.charAt(i));
			
		}
		
		for(char c :numList) {
			cubed += Math.pow(Character.getNumericValue(c),3);
			
		}
		System.out.println(cubed);
		return null;
	
		
		
		
		
	}

}
