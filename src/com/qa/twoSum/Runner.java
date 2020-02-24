package com.qa.twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []test = {1,2,7,3,4};
		
		System.out.println(Arrays.toString(twoSum(test, 9)));

	}
	
	public static int[] twoSum(int[]nums, int target) {
		
		
		
		HashMap<Integer,Integer> collection = new HashMap<>();
		
		for(int i =0; i<nums.length; i++) {
			collection.put(nums[i], i);
		}
		
		for(int i =0; i<nums.length;i++) {
			
			int difference = target - nums[i];
			if(collection.containsKey(difference)) {
				return new int[] {i,collection.get(difference)};
			}
		}
		return new int[] {-1,-1};
		
		
		
		
	}

}
