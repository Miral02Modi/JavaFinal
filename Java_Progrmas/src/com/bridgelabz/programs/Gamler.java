package com.bridgelabz.programs;

import java.util.Scanner;

public class Gamler {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
		System.out.println("Enter your amount");
		int amt = sc.nextInt();

		System.out.println("Enter The Target goal");
		int goal = sc.nextInt();

		System.out.println("Howmany time to play");
		double num = sc.nextDouble();

		double win = (Util1.gamlerPers(num, amt, goal) / num)*100;
		System.out.println("Winning perentage is::" + Math.round(win)+"%");
		System.out.println("Lossing perentage is::" + (100-Math.round(win))+"%");
		}
		else{
			System.out.println();
		}
			
	}
}
