package com.qa.factorial;

public class Runner {

	public static void main(String[] args) {
		System.out.println(factorial(6));
		System.out.println(factorial2(6));

	}
	public static int factorial(int n) {
		
		
		if(n ==1 ) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	public static int factorial2(int n) {
		
		int fact = 1;
		
		for(int i = 1; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	


}
