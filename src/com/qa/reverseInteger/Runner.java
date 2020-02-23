package com.qa.reverseInteger;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseInteger(123);

	}
	
	public static int reverseInteger(int num) {
		//123
		int reversed = 0;
		int pop;
		
		while(num!=0) {
			//e.g 123%10 = 3
			pop = num%10;
			//e.g. 123/10 = 12
			num /=10;
			
			reversed = (reversed*10) + pop;	
		}
		return reversed;
	}

}
