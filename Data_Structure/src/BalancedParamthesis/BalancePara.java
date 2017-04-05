package BalancedParamthesis;
import java.util.Scanner;

public class BalancePara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression");
		String str = sc.next();
		
		StackDemo sd = new StackDemo(str.length());
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(')
				sd.push(ch);
			else if (ch == ')')
				sd.pop();
		}
		
		if (sd.isEmpty())
			System.out.println("Parathesis is Balanced");
		else
			System.out.println("Parathesis is not Balanced");
	}

}
