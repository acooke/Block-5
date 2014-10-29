package com.bayviewglen.test;

public class TestOne {

	public static void main(String[] args) {
		// We'll be tested on math.sqrt (
		// We'll be tested on math.abs (absolute value)
		// We'll be tested on math.pow (Power)
		
		int x = 2;
		int y = -2;
		double z = -2.0;
				
				
		System.out.println(x);
		System.out.println(Math.sqrt(x));
		
		System.out.println(y);
		System.out.println(Math.abs(y));
		
		System.out.println(z);
		System.out.println(Math.abs(z));
		
		System.out.println(Math.sqrt(z));
		System.out.println(Math.sqrt(y));
		// The sqrt function will always cast a variable as a double, regardless of input
		// System.out.println(Math.sqrt("Shon"));
		// We cannot apply variable "Shon" to a sqrt
		
		System.out.println(Math.sqrt(Math.abs(z)));

		System.out.println(Math.pow(z,2));
		System.out.println(Math.pow(x,2));
		System.out.println(Math.pow(y,2));
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(Math.PI)); //Manual rounding = Tells it to round up
		System.out.println(Math.floor(Math.PI)); //Manual rounding down
		System.out.println(Math.round(Math.PI)); //Logical rounding
		
		

		
	}

}
