package com.qa.fizzbuzz;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fizzBuzzPopSnap(9));

	}
	
	public static String fizzBuzzPopSnap(int num) {
		
		String result = "";
		
		if(num % 3 ==0) {
			result += "fizz";
		}
		if(num % 5 ==0) {
			result += "buzz";
		}
		if(num%7 == 0) {
			result += "pop";
		}
		if(num%11 ==0) {
			result += "snap";
		}
		if(num%3!=0&&num%5!=0&&num%7!=0&&num%11!=0) {
			result +=num;
		}
		return result;
		
	}

}
