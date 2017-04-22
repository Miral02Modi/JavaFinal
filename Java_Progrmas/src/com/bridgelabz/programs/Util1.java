package com.bridgelabz.programs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.programs.Bank_Counter;
import com.bridgelabz.programs.Gamler;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.time.LocalTime;

class Util1 {

	/*pelindrom checker*/
	static public void pelindromCheck(String str, ArrayDeque q1) {
		for (int j = str.length() - 1; j > (str.length() / 2); j--) {
			if ((Character) q1.peek() == str.charAt(j))
				q1.poll();
			else
				break;
		}
		if (q1.size() == 0 || q1.size() == 1)
			System.out.println("It is pelindrom");
		else
			System.out.println("It isnot pelindrom");
	}

	
	/*balance paranthesis*/
	static void balanceParanthesis(String str) {
		StackDemo sd = new StackDemo(str.length());

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				sd.push(ch);
			else if (ch == ')' || ch == '}' || ch == ']') {
				try {
					sd.pop();
				} catch (Exception e) {
					System.out.println("It is not a balanced");
				}
			}
		}

		if (sd.isEmpty())
			System.out.println("Parathesis is Balanced");
		else
			System.out.println("Parathesis is not Balanced");
	}

	
	/*bankcase checker*/
	static void bankCase(ArrayDeque q1, int length) {
		Scanner sc = new Scanner(System.in);

		Bank_Counter bnk = null;
		int count = 0;
		boolean nextUser = true;
		boolean flag = true;
		do {

			System.out.println("1. Deposite   ::");
			System.out.println("2. withdrawal ::");
			System.out.println("3. Exit       ::");
			System.out.print("Enter the choice::");
			int ch = sc.nextInt();

			if (count == 0 && nextUser) {
				System.out.println("Next User::");
				bnk = (Bank_Counter) q1.remove();
				length--;
			}
			nextUser = false;
			switch (ch) {

			case 1:
				System.out.println("Deposite amount is::");
				System.out.println("Your balance is::" + bnk.deposite(sc.nextDouble()));
				nextUser = false;
				count++;
				break;
			case 2:
				System.out.println("Widthdrawal amount is::");
				System.out.println("Your balance is::" + bnk.widthDrawal(sc.nextDouble()));
				count++;
				nextUser = false;
				break;
			case 3:
				q1.add(bnk);
				count = 0;
				flag = false;
				nextUser = true;
				break;
			default:
				System.out.println("Please enter the valid choice");
				break;
			}
		} while (length != 0);

	}

	/*vending machine generator money*/ 
	public static void vending(int amount, int rs[]) {
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

	
	/*gambler number of winning percentage*/
	static double gamlerPers(double num, int amt, int goal) {
		int i = 0;
		double win = 0;
		if (num > 0 && amt < goal) {
			while (i < num && amt < goal && amt > 0) {
				if (Math.random() > 0.5) {
					win++;
					amt = amt + 1;
				} else
					amt = amt - 1;
				i++;
			}
		} else {
			String args[] = new String[1];
			System.out.println("Enter the valid Data");
			System.out.println("Enter the data again");
			Gamler.main(args);
		}
		return win;
	}

	
	/*2d array input*/
	static void d2Array(int rows, int cols) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter The Data::");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n------------------------");

		OutputStream out = new OutputStream() {

			public void write(int b) throws IOException {

			}
		};
		OutputStreamWriter ow = new OutputStreamWriter(out);
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				pw.println(arr[i][j]);
			}
		}
		pw.flush();
		pw.close();
	}

	static int fin = 0;

	/*check the prime number is valid or not*/
	public static boolean chckPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	
	public static boolean checkFact(int multiple, int multiplier) {
		return multiple % multiplier == 0;
	}

	/*binary search value present or not checker*/
	static boolean isPresent(int start, int end, int ch) {

		int mid = (start + end) / 2;
		Scanner scr = new Scanner(System.in);
		if (fin == ch) {
			System.out.println("Your Number is " + mid + "?");
			String str = scr.next();
			boolean flag = str.equalsIgnoreCase("yes");
			if (flag)
				return true;
			else {
				System.out.println("Your Number is" + (mid + 1));
				return true;
			}
		}
		System.out.println("Your Number is less than " + mid + " yes or No");
		String str = scr.next();
		boolean flag = str.equalsIgnoreCase("yes");
		fin++;
		if (flag) {
			end = mid;
			isPresent(start, end, ch);
		} else {
			start = mid;
			isPresent(start, end, ch);
		}
		return true;
	}

	
	/*count the number of time head and tail */
	static double flipCoin(double flip) {
		double head = 0, tail = 0;
		for (int i = 1; i < flip; i++) {
			if (Math.random() <= 0.5)
				head++;
			else
				tail++;
		}
		double perset = (head / flip) * 100;
		return perset;
	}

	
	/*validation of year*/
	static boolean isValidDate(int year) {
		int count = 0;
		while (year != 0) {
			int n = year % 10;
			count++;
			year = year / 10;
		}
		return count > 0;
	}

	/*harmonic value*/
	static double harmonic(double num) {
		double harmonic = 0;
		for (double i = 1; i <= num; i++) {
			double j = 1 / i;
			harmonic = harmonic + j;
		}
		return harmonic;
	}

/*summation of three in number checker*/	
	static int sum(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; j < arr.length - 1; j++) {
					if ((arr[i] + arr[j] + arr[k]) == 0) {
						count++;
					}
				}
			}

		}
		return count;
	}

	/*bubblesort sorting for character*/
	static char[] bubbleSortString(String str) {
		char swap = 0;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					swap = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = swap;
				}

			}
		}
		return arr;
	}

	
	/*bubblesort for String*/ 
	static String[] bubbleSortString1(String str) {
		String[] strArr = str.split(" ");
		String swapStr;
		for (int t = 0; t < strArr.length - 1; t++) {
			for (int j = 0; j < strArr.length - t - 1; j++) {
				if (strArr[j + 1].compareTo(strArr[j]) < 0) {
					swapStr = strArr[j];
					strArr[j] = strArr[j + 1];
					strArr[j + 1] = swapStr;
				}
			}
		}
		System.out.println(Arrays.toString(strArr));
		return strArr;
	}

	/*binarySearch for the String*/
	static public boolean binarySearchString1(String[] arr, String key) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key.equals(arr[mid])) {
				String s1 = "" + arr[mid];
				return true;
			}
			if (key.compareTo(arr[mid]) < 0) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}

	/*coupon number generator*/
	static public int generator(int numCoup) {
		int count = 0;
		int arr[] = new int[numCoup];
		int count1 = 0;
		Random rm = new Random();
		for (int i = 1; count1 != numCoup; i++) {
			boolean flag = true;
			int gen = (int) Math.round(Math.random() * numCoup) + 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == gen && gen != 6) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(gen);
				arr[count1++] = gen;
			}
			count++;
		}
		System.out.println("Count is::" + count);
		return count;
	}

	/*insertionsort for integer*/
	public static int[] insertionSort(int arr[]) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		return arr;
	}

	/*insertion sort fot characetr*/
	public static char[] insertionSort(char arr[]) {
		for (int j = 1; j < arr.length; j++) {
			char key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		return arr;
	}

	/*insertion sort for string*/
	public static String[] insertionSortStr(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String index = arr[i];
			int j = i - 1;
			while (j >= 0 && (arr[j].compareTo(index)) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = index;
		}
		return arr;
	}

	/*bubble sort for integer*/
	static int[] bubbleSortInt(int arr[]) {
		int swap = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					swap = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = swap;
				}

			}
		}
		return arr;
	}

	/*binary serach for string*/
	static public String binarySearchString(char[] arr, char key) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {
				String s1 = "" + arr[mid];
				return s1;
			}
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return null;
	}

	/*binarysearch for integer*/
	static public int binarySearchInt(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {
				return arr[mid];
			}
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	

	/*start time */
	long startTime() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());
		return System.currentTimeMillis();
	}
	
	
	/*end time display*/
	long endTime() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());
		return System.currentTimeMillis();
	}
	

	/*elapsetime counting*/
	long elapseTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Start the clock");
		int tmp1 = sc.nextInt();
		long sTime = startTime();
		System.out.println("please wait sometime");

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter 2 for end the clock");
		int tmp2 = sc.nextInt();
		long eTime = endTime();
		return eTime - sTime;
	}

	/*stock price counting*/
	void stockPrice(Stock st[], String name) {
		int price = 0;
		for (int i = 0; i < st.length; i++) {
			if (name.equals(st[i].getName())) {
				System.out.println("Each share price " + (st[i].getnumShare() * st[i].getPrice()));
			}
			price = price + (st[i].getnumShare() * st[i].getPrice());
		}
		System.out.println(price);
	}
}
