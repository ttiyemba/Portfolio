package com.qa.chickenOrRabbits;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		chickenAndRabbits(35,94);
		//chickenAndRabbits2(72,200);

	}
	
	public static void chickenAndRabbits(int heads, int legs) {
		
	
		
		for(int i=1; i<=heads;i++) {
			for(int j=1; j<=heads;j++) {
				if((i+j)==heads && (i*2+j*4) == legs) {
				System.out.println("chicken = " +i + "rabbit = " + j);
				}
			}
			
		}
	}
	
	public static void chickenAndRabbits2(int heads, int legs) {
		
		int rabbits = (legs/2) - heads;
		int chicken = heads - rabbits;
		System.out.println("Rabbits = "+rabbits+"Chicken = "+chicken);
	}

}
