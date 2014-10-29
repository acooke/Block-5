/* 
 Name: Aidan Cooke
 Course: ICS3U AP
 Title: Cross Country Assignment
 Description: Calculates the split times between mile one and mile two and the split times between mile 2 and 5 kilometers
 				Returns these times to the user.
 Due Date: Oct 31st, 2014
 Teacher: Mr. Deslauriers
 */


package com.bayviewglen.crosscountry;

import java.util.Scanner;

import java.text.DecimalFormat;

public class CrossCountry {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your first and last name:");
		String runner1name = keyboard.nextLine();
		System.out.print("Please enter your time for 1 mile <mm:ss.sss>:");
		String runner1m1 = keyboard.nextLine();
		System.out.print("Please enter your time for 2 miles <mm:ss.sss>:");
		String runner1m2 = keyboard.nextLine();
		System.out.print("Please enter your time for 5 kilometers <mm:ss.sss>:");
		String runner15k = keyboard.nextLine();
		
		// convert splits to seconds
		int positionr1s1 = runner1m1.indexOf(':');
		String min1 = runner1m1.substring(0,positionr1s1);
		String sec1 = runner1m1.substring(positionr1s1+1);
		double r1m1minfinal = Double.valueOf(min1) * 60;
		double r1m1secfinal = Double.valueOf(sec1);
		double r1m1timetotal = r1m1secfinal + r1m1minfinal;
		
		int positionr1m2 = runner1m2.indexOf(':');
		String min2 = runner1m2.substring(0,positionr1m2);
		String sec2 = runner1m2.substring(positionr1m2+1);
		double r1m2minfinal = Double.valueOf(min2) * 60;
		double r1m2secfinal = Double.valueOf(sec2);
		double r1m2timetotal = r1m2secfinal + r1m2minfinal;	
		
		double r1split2InSeconds = r1m2timetotal - r1m1timetotal;
		int r1split2Minutes = (int)r1split2InSeconds/60;
		double r1split2Seconds = r1split2InSeconds - r1split2Minutes * 60;
		
		int positionr15k = runner15k.indexOf(':');
		String min3 = runner15k.substring(0,positionr15k);
		String sec3 = runner15k.substring(positionr15k+1);
		double r15kminfinal = Double.valueOf(min3) * 60;
		double r15ksecfinal = Double.valueOf(sec3);
		double r15ktimetotal = r15ksecfinal + r15kminfinal;	
		
		double r1split3InSeconds = r15ktimetotal - r1m2timetotal;
		int r1split3Minutes = (int)r1split3InSeconds/60;
		double r1split3Seconds = r1split3InSeconds - r1split3Minutes * 60;
		
		DecimalFormat formatter = new DecimalFormat("00.000");
		
		System.out.println("\n");
		
		System.out.println("********RUNNER ONE SUMMARY********");
		System.out.println("Name:" + runner1name);
		System.out.println("Mile 1 Time: " + runner1m1);
		System.out.println("Split Two: " + r1split2Minutes + ":" + formatter.format(r1split2Seconds));
		System.out.println("Split Three: " + r1split3Minutes + ":" + formatter.format(r1split3Seconds));
		System.out.println("\n");
		
		/*
		System.out.println("Mile 1 Time: " + formatter.format(r1m1timetotal));
		System.out.println("Mile 2 Time: " + formatter.format(r1m2timetotal));
		System.out.println("5 Kilometer Time: " + formatter.format(r15ktimetotal));
		*/
		
		System.out.print("Please enter your first and last name:");
		String runner2name = keyboard.nextLine();
		System.out.print("Please enter your time for 1 mile <mm:ss.sss>:");
		String runner2m1 = keyboard.nextLine();
		System.out.print("Please enter your time for 2 miles <mm:ss.sss>:");
		String runner2m2 = keyboard.nextLine();
		System.out.print("Please enter your time for 5 kilometers <mm:ss.sss>:");
		String runner25k = keyboard.nextLine();
		System.out.println("\n");
		
		// convert splits to seconds
		int positionr2s1 = runner2m1.indexOf(':');
		String min4 = runner2m1.substring(0,positionr2s1);
		String sec4 = runner2m1.substring(positionr2s1+1);
		double r2m1minfinal = Double.valueOf(min4) * 60;
		double r2m1secfinal = Double.valueOf(sec4);
		double r2m1timetotal = r2m1secfinal + r2m1minfinal;
		
		int positionr2m2 = runner2m2.indexOf(':');
		String min5 = runner2m2.substring(0,positionr2m2);
		String sec5 = runner2m2.substring(positionr2m2+1);
		double r2m2minfinal = Double.valueOf(min5) * 60;
		double r2m2secfinal = Double.valueOf(sec5);
		double r2m2timetotal = r2m2secfinal + r2m2minfinal;	
		
		double r2split2InSeconds = r1m2timetotal - r2m1timetotal;
		int r2split2Minutes = (int)r2split2InSeconds/60;
		double r2split2Seconds = r2split2InSeconds - r2split2Minutes * 60;
		
		int positionr25k = runner25k.indexOf(':');
		String min6 = runner25k.substring(0,positionr25k);
		String sec6 = runner25k.substring(positionr25k+1);
		double r25kminfinal = Double.valueOf(min6) * 60;
		double r25ksecfinal = Double.valueOf(sec6);
		double r25ktimetotal = r25ksecfinal + r25kminfinal;	
		
		double r2split3InSeconds = r25ktimetotal - r2m2timetotal;
		int r2split3Minutes = (int)r2split3InSeconds/60;
		double r2split3Seconds = r2split3InSeconds - r2split3Minutes * 60;
		
		System.out.println("********RUNNER TWO SUMMARY********");
		System.out.println("Name:" + runner2name);
		System.out.println("Mile 1 Time: " + runner2m1);
		System.out.println("Split Two: " + r2split2Minutes + ":" + formatter.format(r2split2Seconds));
		System.out.println("Split Three: " + r2split3Minutes + ":" + formatter.format(r2split3Seconds));
		System.out.println("\n");
		
		System.out.print("Please enter your first and last name:");
		String runner3name = keyboard.nextLine();
		System.out.print("Please enter your time for 1 mile <mm:ss.sss>:");
		String runner3m1 = keyboard.nextLine();
		System.out.print("Please enter your time for 2 miles <mm:ss.sss>:");
		String runner3m2 = keyboard.nextLine();
		System.out.print("Please enter your time for 5 kilometers <mm:ss.sss>:");
		String runner35k = keyboard.nextLine();
		System.out.println("\n");
		
		// convert splits to seconds
		int positionr3s1 = runner3m1.indexOf(':');
		String min7 = runner3m1.substring(0,positionr3s1);
		String sec7 = runner3m1.substring(positionr3s1+1);
		double r3m1minfinal = Double.valueOf(min7) * 60;
		double r3m1secfinal = Double.valueOf(sec7);
		double r3m1timetotal = r3m1secfinal + r3m1minfinal;
		
		int positionr3m2 = runner3m2.indexOf(':');
		String min8 = runner3m2.substring(0,positionr3m2);
		String sec8 = runner3m2.substring(positionr3m2+1);
		double r3m2minfinal = Double.valueOf(min8) * 60;
		double r3m2secfinal = Double.valueOf(sec8);
		double r3m2timetotal = r3m2secfinal + r3m2minfinal;	
		
		double r3split2InSeconds = r3m2timetotal - r3m1timetotal;
		int r3split2Minutes = (int)r3split2InSeconds/60;
		double r3split2Seconds = r3split2InSeconds - r3split2Minutes * 60;
		
		int positionr35k = runner35k.indexOf(':');
		String min9 = runner35k.substring(0,positionr35k);
		String sec9 = runner35k.substring(positionr35k+1);
		double r35kminfinal = Double.valueOf(min9) * 60;
		double r35ksecfinal = Double.valueOf(sec9);
		double r35ktimetotal = r35ksecfinal + r35kminfinal;	
		
		double r3split3InSeconds = r35ktimetotal - r3m2timetotal;
		int r3split3Minutes = (int)r3split3InSeconds/60;
		double r3split3Seconds = r3split3InSeconds - r3split3Minutes * 60;
		
		System.out.println("********RUNNER THREE SUMMARY********");
		System.out.println("Name:" + runner3name);
		System.out.println("Mile 1 Time: " + runner3m1);
		System.out.println("Split Two: " + r3split2Minutes + ":" + formatter.format(r3split2Seconds));
		System.out.println("Split Three: " + r3split3Minutes + ":" + formatter.format(r3split3Seconds));
		System.out.println("\n");
		
		System.out.print("Please enter your first and last name:");
		String runner4name = keyboard.nextLine();
		System.out.print("Please enter your time for 1 mile <mm:ss.sss>:");
		String runner4m1 = keyboard.nextLine();
		System.out.print("Please enter your time for 2 miles <mm:ss.sss>:");
		String runner4m2 = keyboard.nextLine();
		System.out.print("Please enter your time for 5 kilometers <mm:ss.sss>:");
		String runner45k = keyboard.nextLine();
		System.out.println("\n");
		
		// convert splits to seconds
		int positionr4s1 = runner4m1.indexOf(':');
		String min10 = runner4m1.substring(0,positionr4s1);
		String sec10 = runner2m1.substring(positionr4s1+1);
		double r4m1minfinal = Double.valueOf(min10) * 60;
		double r4m1secfinal = Double.valueOf(sec10);
		double r4m1timetotal = r4m1secfinal + r4m1minfinal;
		
		int positionr4m2 = runner2m2.indexOf(':');
		String min11 = runner2m2.substring(0,positionr4m2);
		String sec11 = runner2m2.substring(positionr4m2+1);
		double r4m2minfinal = Double.valueOf(min11) * 60;
		double r4m2secfinal = Double.valueOf(sec11);
		double r4m2timetotal = r4m2secfinal + r4m2minfinal;	
		
		double r4split2InSeconds = r4m2timetotal - r4m1timetotal;
		int r4split2Minutes = (int)r4split2InSeconds/60;
		double r4split2Seconds = r4split2InSeconds - r4split2Minutes * 60;
		
		int positionr45k = runner45k.indexOf(':');
		String min12 = runner45k.substring(0,positionr45k);
		String sec12 = runner45k.substring(positionr45k+1);
		double r45kminfinal = Double.valueOf(min12) * 60;
		double r45ksecfinal = Double.valueOf(sec12);
		double r45ktimetotal = r45ksecfinal + r45kminfinal;	
		
		double r4split3InSeconds = r45ktimetotal - r4m2timetotal;
		int r4split3Minutes = (int)r4split3InSeconds/60;
		double r4split3Seconds = r4split3InSeconds - r4split3Minutes * 60;
		
		System.out.println("********RUNNER FOUR SUMMARY********");
		System.out.println("Name:" + runner4name);
		System.out.println("Mile 1 Time: " + runner4m1);
		System.out.println("Split Two: " + r4split2Minutes + ":" + formatter.format(r4split2Seconds));
		System.out.println("Split Three: " + r4split3Minutes + ":" + formatter.format(r4split3Seconds));
		System.out.println("\n");
		
		System.out.print("Please enter your first and last name:");
		String runner5name = keyboard.nextLine();
		System.out.print("Please enter your time for 1 mile <mm:ss.sss>:");
		String runner5m1 = keyboard.nextLine();
		System.out.print("Please enter your time for 2 miles <mm:ss.sss>:");
		String runner5m2 = keyboard.nextLine();
		System.out.print("Please enter your time for 5 kilometers <mm:ss.sss>:");
		String runner55k = keyboard.nextLine();
		System.out.println("\n");
		
		// convert splits to seconds
		int positionr5s1 = runner5m1.indexOf(':');
		String min13 = runner5m1.substring(0,positionr5s1);
		String sec13 = runner5m1.substring(positionr5s1+1);
		double r5m1minfinal = Double.valueOf(min13) * 60;
		double r5m1secfinal = Double.valueOf(sec13);
		double r5m1timetotal = r5m1secfinal + r5m1minfinal;
		
		int positionr5m2 = runner5m2.indexOf(':');
		String min14 = runner5m2.substring(0,positionr5m2);
		String sec14 = runner5m2.substring(positionr5m2+1);
		double r5m2minfinal = Double.valueOf(min14) * 60;
		double r5m2secfinal = Double.valueOf(sec14);
		double r5m2timetotal = r5m2secfinal + r5m2minfinal;	
		
		double r5split2InSeconds = r5m2timetotal - r5m1timetotal;
		int r5split2Minutes = (int)r5split2InSeconds/60;
		double r5split2Seconds = r5split2InSeconds - r5split2Minutes * 60;
		
		int positionr55k = runner55k.indexOf(':');
		String min15 = runner55k.substring(0,positionr55k);
		String sec15 = runner55k.substring(positionr55k+1);
		double r55kminfinal = Double.valueOf(min15) * 60;
		double r55ksecfinal = Double.valueOf(sec15);
		double r55ktimetotal = r55ksecfinal + r55kminfinal;	
		
		double r5split3InSeconds = r55ktimetotal - r5m2timetotal;
		int r5split3Minutes = (int)r5split3InSeconds/60;
		double r5split3Seconds = r5split3InSeconds - r5split3Minutes * 60;
		
		System.out.println("********RUNNER FIVE SUMMARY********");
		System.out.println("Name:" + runner5name);
		System.out.println("Mile 1 Time: " + runner5m1);
		System.out.println("Split Two: " + r5split2Minutes + ":" + formatter.format(r5split2Seconds));
		System.out.println("Split Three: " + r5split3Minutes + ":" + formatter.format(r5split3Seconds));
		System.out.println("\n");
		
	}

}
