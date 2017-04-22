package com.bridgelabz.programs;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number::");
		if (sc.hasNextInt()) {
			double num = sc.nextDouble();
			System.out.println(Util1.harmonic(num));
		} else {
			System.out.println("Enter the integer Only");
			main(args);
		}

	}
}
