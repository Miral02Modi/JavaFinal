package com.bridgelabz.programs;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Number of Time to Flip");
		if (scr.hasNextInt()) {
			int flip = scr.nextInt();
			System.out.println("Head Percentage is::" + (int) Util1.flipCoin(flip) + "%");
			System.out.println("Tail Percentage is::" + (int) (100 - Util1.flipCoin(flip)) + "%");
		}else{
			main(args);
			System.out.println("Enter the integer Only");
		}
	}
}
