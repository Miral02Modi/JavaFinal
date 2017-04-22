package com.bridgelabz.programs;

import java.util.Scanner;
public class Factor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the integer number");
		if (scn.hasNextInt()) {
			int N = scn.nextInt();
			System.out.println("Prime factors for given number are :");
			for (int i = 2; i <= N / 2; i++) {
				if ((Util.checkFact(N, i)) && (Util.chckPrime(i))) {
					System.out.print(i + "\t");
				}
			}
		} else {
			System.out.println("Enter integers only");
			main(args);
		}
		scn.close();
	}
}
