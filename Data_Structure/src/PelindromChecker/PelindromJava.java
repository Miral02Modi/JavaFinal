package PelindromChecker;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PelindromJava {

	public static void main(String[] args) {

		ArrayDeque<Character> q1 = new ArrayDeque<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Expression::");
		String str = sc.next();

		int len = str.length() / 2;
		int i = 0;
		for (; i < str.length() / 2; i++)
			q1.add(str.charAt(i));
		
		
		for (int j = str.length()-1; j > (str.length() / 2) ; j--) {
			if (q1.peek() == str.charAt(j))
				q1.poll();
			else
				break;
		}
		if (q1.size() == 0 || q1.size() == 1)
			System.out.println("It is pelindrom");
		else
			System.out.println("It isnot pelindrom");

	}
}
