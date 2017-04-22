package com.bridgelabz.programs;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;

		Scanner scr = new Scanner(System.in);
		System.out.print("Enter The year::");
		if(scr.hasNextInt()){
		year = scr.nextInt();
		if (Util1.isValidDate(year)) 
		{
			if (year % 4 == 0 && year % 100 != 0)
				System.out.println("Given year is Leap year");
			else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
				System.out.println("Given year is Leap year");
			else
				System.out.println("Given year is not Leap year");
		}else
			System.out.println("Please enter valid year");
		}else{
			System.out.println("Enter the integer only");
			main(args);
		}
	}
}
