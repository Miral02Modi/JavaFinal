package BankCashCounter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayDeque<Bank_Counter> q1 = new ArrayDeque<>();
		System.out.println("Enter The Number of user in queue");
		int length = sc.nextInt();
		for (int i = 0; i < length; i++) {
			System.out.print("Enter The Name::");
			String name = sc.next();
			System.out.print("Enter The id::");
			int id = sc.nextInt();
			System.out.print("Enter The sal::");
			double sal = sc.nextInt();
			q1.add(new Bank_Counter(name, id, sal));
		}

		Util.bankCase(q1, length);
	}
	
	


}
