package com.bridgelabz.programs;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String str = "Hello username how are you";
		System.out.println(str.replaceAll("username", str));
	}
}
