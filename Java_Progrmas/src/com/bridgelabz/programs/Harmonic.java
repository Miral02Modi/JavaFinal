package com.bridgelabz.programs;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number::");
		double num = sc.nextDouble();
		System.out.println(Util.harmo(num));
	}
}
