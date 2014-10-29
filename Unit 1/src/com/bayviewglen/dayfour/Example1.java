package com.bayviewglen.dayfour;

public class Example1 {

	public static void main(String[] args) {
		System.out.println(3*6); // 18
		System.out.println(3+6); // 9
		System.out.println(3/6); // 0 - Both Operands and are Integers
		
		System.out.println(3.0*6); //18.0
		System.out.println(3+6.0); //9.0
		System.out.println(3.0/6); //0.5 - One operand is a double so I get double division
		
		System.out.println(3%6); //33 - the remainder is 3
		System.out.println(23%2); //1 - this is how we find out if it's even or not
		System.out.println(45876%10); //6 mod it by 10 to get the last digit

	}

}
