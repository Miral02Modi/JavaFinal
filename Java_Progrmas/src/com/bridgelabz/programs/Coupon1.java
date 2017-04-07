package com.bridgelabz.programs;

import java.util.Random;
import java.util.Scanner;

public class Coupon1 {
	public static void main(String[] args) {
		
		int count=0;
		int numCoup;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value::");
		numCoup = sc.nextInt();
		System.out.println(Util.generator(numCoup));;
	}
}	

