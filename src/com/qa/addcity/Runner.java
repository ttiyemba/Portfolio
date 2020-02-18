package com.qa.addcity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addcity(test2);

	}

	static int[] test2 = { 1, 2, 3, 4, 5, 6 };

	static List<Integer> addcity(int[] nums) {

		ArrayList<Integer> newlist = new ArrayList<Integer>();

		

		return Arrays.stream(nums).boxed().filter(num->num % 2 == 1).collect(Collectors.toList());

	}

}
