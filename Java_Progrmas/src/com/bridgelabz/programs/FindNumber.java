package com.bridgelabz.programs;

import java.util.Scanner;

class FindNumber {
	public static void main(String args[]) {
		Scanner scr1 = new Scanner(System.in);
		System.out.println("Enter The two to the Power");
		int range = scr1.nextInt();
		int pow = (int) Math.pow(2, range);
		System.out.println("Assume One Number please between 1 to " + pow);
		Util.isPresent(0, pow, range - 1);
	}
}
