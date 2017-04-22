package com.bridgelabz.programs;

import java.util.Random;
import java.util.Scanner;

public class Coupon1 {
	public static void main(String[] args) {
		
		int count=0;
		int numCoup = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value::");
		if(sc.hasNextInt())
			numCoup = sc.nextInt();
		else{
			System.out.println("Enter the integer value");
			main(args);
		}	
		System.out.println(Util1.generator(numCoup));
	}
}	

