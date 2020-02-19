package com.qa.powerOf;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPowerOfN(27,6));

	}
	
	/**
	 * 
	 * @param num - this is the number we are checking
	 * @param power - the is the power of 
	 * @return - true or false
	 */
	public static boolean isPowerOfN(int num, int power) {
		if(num<1) {
			return false;
		}
		while(num % power == 0) {
			num /= power;
		}
		return (num==1);
	}
	
	//logic while num is divideable by power keep diving num until we ended up with 1

}
