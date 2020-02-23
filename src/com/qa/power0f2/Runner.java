package com.qa.power0f2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(powerOfTwo(6));

	}
	
	public static boolean powerOfTwo(int num) {
		int i = 1;
		
		while(i<num) {
			i*=2;
		}
		return i==num;
	}

}
