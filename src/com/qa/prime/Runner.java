package com.qa.prime;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int primeNumber(int max) {
		int primeCounter = 0;
		for(int i=2; i<=max; i++) {
			boolean isPrime = true;
			for(int j=2; j<= (int) Math.sqrt(i); j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				primeCounter+=1;
			}
		}
		return primeCounter;
		
	}

}
