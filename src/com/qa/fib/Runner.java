package com.qa.fib;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	 int fibonacci(int num) {
		 if(num ==0) {
			 return 0;
		 }
		 int firstpos = 0;
		 int nextpos = 1;
		 
		 for(int i = 0; i<num -1; i++) {
			 int temp = firstpos;
			 firstpos = nextpos;
			 nextpos = firstpos+temp;
		 }
		 return nextpos;
		
	}
	 
	 int fibanacci2(int num) {
		 if(num == 0) {
			 return 0;
		 }else if (num == 1) {
			 return 1;
		 }else {
			 return fibanacci2(num-1) + fibanacci2(num-2);
		 }
	 }

}
