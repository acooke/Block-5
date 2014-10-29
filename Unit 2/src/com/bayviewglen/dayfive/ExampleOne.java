package com.bayviewglen.dayfive;

import java.text.DecimalFormat; 

public class ExampleOne {

	public static void main(String[] args) {
		
		double x = 356.56;
		DecimalFormat formatter = new DecimalFormat("##.00000");
		System.out.println(formatter.format(x));
	}
}
