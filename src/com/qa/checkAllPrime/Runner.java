package com.qa.checkAllPrime;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPrimeNumbers(15);

	}
	
	
	public static void checkPrimeNumbers(int num) {
		
		
		
		
		
		for(int i = 2; i <=num; i++) {
			for(int j = 2; j<=i; j++) {
				if(j==i) {
					System.out.println(i);
				}
				if(i%j==0) {
					break;
				}
			}
		}
		
		
		
	}

}
