package com.qa.addcity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add2(7);

	}
	
	
	public static int add(int num) {
		
		
		
		int results = 0;
		
		for(int i=0; i<num;i++) {
			
			int first = num/10;
			int second = num%10;
			results = first + second;
		
			//System.out.println(results);
		}
		
		System.out.println(results);
		return results;
	}
	
	public static int add2(int num) {
		
		int sum = 0;
		
		while(num !=0) {
			sum += num %10;
			num = num/10;
			
		}
		System.out.println(sum);
		
		return sum;
	}

}
