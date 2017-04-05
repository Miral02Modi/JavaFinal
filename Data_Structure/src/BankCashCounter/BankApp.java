package BankCashCounter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Queue<Bank_Counter> q1 = new ArrayDeque<>();
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

		Bank_Counter bnk = null;
		int count = 0;
		boolean nextUser=true; 
		boolean flag = true;
		do {

			System.out.println("1. Deposite   ::");
			System.out.println("2. withdrawal ::");
			System.out.println("3. Exit       ::");
			System.out.print("Enter the choice::");
			int ch = sc.nextInt();
			
			
			if (count == 0 && nextUser){
				System.out.println("Next User::");
				bnk = q1.remove();
				length--;
			}	
			nextUser = false;
			switch (ch) {

			
			case 1:
				System.out.println("Deposite amount is::");
				System.out.println("Your balance is::"+bnk.deposite(sc.nextDouble()));
				nextUser = false;
				count++;
				break;
			case 2:
				System.out.println("Widthdrawal amount is::");
				System.out.println("Your balance is::"+bnk.widthDrawal(sc.nextDouble()));
				count++;
				nextUser = false;
				break;
			case 3:
				q1.add(bnk);
				count = 0;
				flag = false;
				nextUser=true;
				break;
			default:
				System.out.println("Please enter the valid choice");
				break;
			}
		} while (length!=0);
	}

}
