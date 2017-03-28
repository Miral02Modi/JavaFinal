import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;

		Scanner scr = new Scanner(System.in);
		System.out.print("Enter The year::");
		year = scr.nextInt();

		if (isValidDate(year)) 
		{
			if (year % 4 == 0 && year % 100 != 0)
				System.out.println("Given year is Leap year");
			else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
				System.out.println("Given year is Leap year");
			else
				System.out.println("Given year is not Leap year");
		}else
			System.out.println("Please enter valid date");
	}

	static boolean isValidDate(int year) {
		int count = 0;
		while (year != 0) {
			int n = year % 10;
			count++;
			year = year / 10;
		}
		return count == 4;
	}
}
