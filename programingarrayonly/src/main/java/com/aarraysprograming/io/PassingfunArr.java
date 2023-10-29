package com.aarraysprograming.io;

import java.util.Arrays;

public class PassingfunArr {
	public void fun() {

	int [] nums = {3,4,5,12};
	System.out.println(Arrays.toString(nums));
	change(nums);
	System.out.println(Arrays.toString(nums));
	
	}
	static void change(int[] arr) {
		arr[0]=10;
	}
	
}
