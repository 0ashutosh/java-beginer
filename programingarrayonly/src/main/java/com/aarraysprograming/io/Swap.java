package com.aarraysprograming.io;

import java.util.Arrays;

public class Swap {
  public static void main (String [] args) {
	  int [] arr = {1,2,3,4,5,6};
	 // swap(arr,1,3);
	  //swap(arr,0,5);
	  reverse(arr);
	  System.out.println(Arrays.toString(arr));
  }
  // we can reverse the array also 
  static void reverse(int [] arr) {
	  int start =0;
	  int end =arr.length-1;
	  while(start<end) {
		  swap(arr, start,end);
		  start++;
		  end--;
		  
	  }
  }
  
   static void swap(int[]arr,int index1, int index2) {
	  // swap code 
	   int temp =arr[index1];
	   arr[index1]=arr[index2];
	   arr[index2] =temp;
	   
  }
}
