package com.bayviewglen.dayone;

import java.util.Scanner;

public class QuestionOne {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);

		System.out.print("Please enter you name: ");
		String a = keyboard.nextLine();
		
		System.out.print("Hello there " + a + ", and welcome to Uzebeckistan.");
		
		keyboard.close();


	}

}
