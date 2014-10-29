package com.bayviewglen.pool;

import java.util.Scanner;

public class PoolBeforeSchool {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the total length of the pool: ");
		double L1 = keyboard.nextDouble();

		System.out.print("Please enter the length of the shallow end: ");
		double L4 = keyboard.nextDouble();

		System.out.print("Please enter the length of the transition: ");
		double L3 = keyboard.nextDouble();

		System.out.print("Please enter the width of the pool: ");
		double W1 = keyboard.nextDouble();

		System.out.print("Please enter the depth of the shallow end: ");
		double H2 = keyboard.nextDouble();

		System.out.print("Please enter the depth of the deep end: ");
		double H1 = keyboard.nextDouble();

		double ninetypercentvolume = 0.9;
		double L2 = L1 - L4 - L3;
		double baseoftriangle = L1 - L4 - L2;
		double H3 = H1 - H2;

		double volume = ninetypercentvolume
				* ((L1 * W1 * H2) + (L2 * W1 * (H1 - H2)) + ((baseoftriangle
						* H3 * W1) / 2));
		double SA = ((2 * (L1 * H2)) + (2 * (H3 * L2)) + (2 * (H3 * baseoftriangle) / 2))
				+ (H1 * W1) + (H2 + W1) + (W1 * L1);

		System.out.println("The amount of water required to keep the pool 90% full is: "
						+ volume + " litres.");
		System.out.println("The amount of liner required to complete the pool is: "
						+ SA + " square metres.");

		System.out.print("Please enter the price of the cheap liner: ");
		double CheapLiner = keyboard.nextDouble();

		System.out.print("Please enter the price of the regular liner: ");
		double RegularLiner = keyboard.nextDouble();

		System.out.print("Please enter the price of the expensive liner: ");
		double ExpensiveLiner = keyboard.nextDouble();

		double CheapCost = SA * CheapLiner;
		double RegularCost = SA * RegularLiner;
		double ExpensiveCost = SA * ExpensiveLiner;

		System.out.println("The total price of the pool with cheap liner is: $" + CheapCost);
		System.out.println("The total price of the pool with regular liner is: $" + RegularCost);
		System.out.println("The total price of the pool with regular liner is: $" + ExpensiveCost);

	}

}
