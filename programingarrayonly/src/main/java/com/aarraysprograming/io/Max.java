package com.aarraysprograming.io;

public class Max {
	 public static void main (String [] args) {
		 int [] arr = {1,2,4,45,6};
	//	 System.out.println(max(arr));
		 System.out.println(maxRange(arr,1,3));
		  
		   
	 }
	 //work on egde cases array being null
	 
	 //array is not empty
	 //max range 
	 
	 static int maxRange(int[] arr, int start,int end) {
		if(end>start)
		{
			return -1;
		}
		if(arr==null)
		{
			return -1;
		}
		 int maxval = arr[start];
		 for(int i =0;i<end;i++) {
			 if(arr[i]>maxval) {
				 maxval = arr[i];
			 }
		 }
		 return maxval;
	 }
	 // if empty then use Integer.MIN_VALUE;
	 
//	 static int max(int[] arr) {
//		 int maxval = arr[0];
//		 for(int i =0;i<arr.length;i++) {
//			 if(arr[i]>maxval) {
//				 maxval = arr[i];
//			 }
//		 }
//		 return maxval;
//	 }
	 
}
