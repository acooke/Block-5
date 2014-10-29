package com.bayviewglen.dayone;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Please enter a word: ");
		String a = keyboard.nextLine();
		System.out.print("Please enter a different word: ");
		String b = keyboard.nextLine();
		
		System.out.println("The words in pattern abba is: " + a + b + b + a);
		
		keyboard.close();
		

	}

}
