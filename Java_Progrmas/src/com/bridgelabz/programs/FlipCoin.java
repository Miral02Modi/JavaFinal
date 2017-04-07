package com.bridgelabz.programs;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Number of Time to Flip");
		int flip = scr.nextInt();
		
		System.out.println("Head Percentage is::"+(int)Util.flipCoin(flip)+"%");
		System.out.println("Tail Percentage is::"+(int)(100-Util.flipCoin(flip))+"%");
	}
}
