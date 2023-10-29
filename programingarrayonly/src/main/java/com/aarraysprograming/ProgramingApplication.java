package com.aarraysprograming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aarraysprograming.io.Array2d;
import com.aarraysprograming.io.ArraysPro;
import com.aarraysprograming.io.PassingfunArr;

@SpringBootApplication
public class ProgramingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramingApplication.class, args);
		// Java, you create objects (instances) of classes to use their methods and fields
//		ArraysPro arrayspro = new ArraysPro();
//		arrayspro.arrayio();
//		
		// Create an instance of PassingfunArr
//		PassingfunArr passingfunArr = new PassingfunArr ();
//		 // Call the fun method of PassingfunArr
//		passingfunArr.fun();
		Array2d array2d =new Array2d();
		array2d.array2do();
	
	}
}
