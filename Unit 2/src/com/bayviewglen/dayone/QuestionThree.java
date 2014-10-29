package com.bayviewglen.dayone;

import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter a word: ");
		String word = keyboard.nextLine();
		System.out.print("Please enter a tag: ");
		String tag = keyboard.nextLine(); 
		
		System.out.print("<" + tag + ">" + word + "</" + tag + ">");
		
		keyboard.close();
	}

}
