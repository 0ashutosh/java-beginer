package com.aarraysprograming.io;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPro {
	public void arrayio() {
	Scanner sc = new Scanner(System.in);  
	//array of primitives
//	int [] arr = new int[5];
//    
//   for(int i =0;i<arr.length;i++)
//   {
//	   arr[i]= sc.nextInt();
//	   
//   }
   
//   for(int j=0;j<arr.length;j++)
//   {
//	   System.out.print(arr[j] + "  " );
//   }
//   for(int num:arr) {
//	   System.out.print(num+ " ");// num represent a=every element in array 
//   }
//   System.out.print(arr[5]);
 //  System.out.println(Arrays.toString(arr));
   
	String [] str = new String[4];
	
	 for(int i=0;i<str.length;i++) {
		 str[i]=sc.next();
		 
	 }
	 System.out.println(Arrays.toString(str));
      str[3]= "prajjwal";
 	 System.out.println(Arrays.toString(str));

}
}