import java.util.Scanner;

public class Vending {

	public static void main(String args[]) {
		int rs[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		System.out.println("enter the amount");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int sum = amount, temp = 0, count = 0, total_count = 0;
		int i = rs.length - 1;
		while (sum >= 0 && i >= 0) {
			temp = sum;
			sum = sum % rs[i];
			if (temp != sum) {
				count = temp / rs[i];
				total_count = total_count + count;
				System.out.println("the number of  count " + rs[i] + " of notes" + count);

			}
			i--;
		}
		System.out.println("the total number of  count of notes" + total_count);

	}

}
