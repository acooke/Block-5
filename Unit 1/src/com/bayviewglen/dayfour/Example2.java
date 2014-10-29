
//Type Casting
//Narrowing and Widening Conversion



package com.bayviewglen.dayfour;

public class Example2 {

	public static void main(String[] args) {
		int age1 = 16;
		int age2 = 17;
		int age3 = 16;
		int numberOfStudents = 3;
		
		double averageAge = (age1 + age2 + age3)/(double)numberOfStudents;
		System.out.println(averageAge);
		//Casting numberOfStudents as a double
		
		averageAge = (int)((age1 + age2 + age3)/(double)numberOfStudents);
		//We are explicitly casting twice
		//We divide a int by a double, stored it as a int, in the double averageAge value
		//Java changes it from int to double when displaying to console
		
		
		System.out.println(averageAge);
	}

}
