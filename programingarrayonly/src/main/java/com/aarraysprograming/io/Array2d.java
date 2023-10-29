package com.aarraysprograming.io;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
      public void array2do() {
    	  
    	  Scanner sc = new Scanner(System.in);
    	  int [] [] arr = new int[3][3];
    	  System.out.print(arr.length);//no of rows
    	  //input
   for(int row =0;row<arr.length;row++)
   {
	   //for each col in row 
	   for(int col =0;col<arr[row].length;col++) {
		   arr[row][col] =sc.nextInt();
	   }
    	  }
//   for(int row =0;row<arr.length;row++)
//   {
//	   //for each col in row 
//	   for(int col =0;col<arr[row].length;col++) {
//		  // arr[row][col] =sc.nextInt();
//	       System.out.print(  arr[row][col]+" ");
//	   }
//	   System.out.println();
//    	  }
//      }
//   for(int row =0;row<arr.length;row++)
//   {
//	   System.out.println(Arrays.toString(arr[row]));
//   }
    for(int []a :arr) {
    	System.out.println(Arrays.toString(a));
    }
    // for element   string 
//    for(String element :arr) {
//    	System.out.println(element);
//    }
}
}