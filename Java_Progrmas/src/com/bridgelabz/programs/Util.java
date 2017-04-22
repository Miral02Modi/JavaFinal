package com.bridgelabz.programs;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;



import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.time.LocalTime;

class Util {
	static int fin = 0;
	/*pelindrom checker*/
	static double gamlerPers(double num,int amt,int goal){
		int i = 0;
		double win = 0;
		
		while (i < num && amt < goal && amt > 0) {
			if (Math.random() > 0.5) {
				win++;
				amt = amt + 1;
			} else
				amt = amt - 1;
			i++;
		}
		return win;
	}
	
	
	/*2d Array input*/
	static void d2Array(int rows, int cols) {
		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter The Data::");
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("\n------------------------");

		OutputStream outputStream = new OutputStream() {

			public void write(int b) throws IOException {

			}
		};
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		PrintWriter printwriter = new PrintWriter(System.out);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				printwriter.println(arr[i][j]);
			}
		}
		printwriter.flush();
		printwriter.close();
	}
	
	
	/*checker prime number*/ 
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

	/*factorial checker*/
	public static boolean checkFact(int multiple, int multiplier) {
		return multiple % multiplier == 0;
	}

	
	/*binary search method for value is present or not*/
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
	
	
	/*flip coin winner*/
	static double flipCoin(double flip){
		double head=0,tail=0;
		for(int i=1; i<flip ;i++){
			if(Math.random()<=0.5)
				head++;
			else
				tail++;
		}
		double perset=(head/flip)*100;
		return perset;
	}
	
	
	/*year validation code*/
	static boolean isValidDate(int year) {
		int count = 0;
		while (year != 0) {
			int n = year % 10;
			count++;
			year = year / 10;
		}
		return count > 0;
	}
	

	/*harmonic number*/
	static double harmonic(double num){
		double harmo = 0;
		for(double i=1 ;i<=num; i++){
			double j=1/i;
			harmo=harmo+j;
		}
		return harmo;
	}
	
	/*sum of the number checker*/
	static int sum(int arr[]){
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

	
	
	/*bubble sort for character*/
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
	
	/*coupon number generator*/
	static public int generator(int numCoup){
		int count=0;
		int arr[] = new int[numCoup];
		int count1=0;
		Random rm = new Random(); 
		for (int i = 1; count1 != numCoup; i++) {
			boolean flag=true;
			int gen = (int)Math.round(Math.random() * numCoup ) +1 ;
			for(int j=0;j<arr.length;j++) {
				if (arr[j] == gen ){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(gen);
				arr[count1++] = gen; 
			}	
			count++;
		}
		System.out.println("Count is::"+count);
		return count;
	}
	
	/*insertion sor for integer*/
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

	/*insertion sort for character*/
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

	/*binary search for string*/
	static public String binarySearchString(String[] arr, String key) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {	
				String s1 = "" + arr[mid];
				return s1;
			}
			if (key.compareTo(arr[mid])<0) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return null;
	}

	/*binary serch for integer*/
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

	
	/*start time*/
	long startTime() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());
		return System.currentTimeMillis();
	}
	
	/*endtime*/
	long endTime() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());
		return System.currentTimeMillis();
	}

	/*elapse time*/
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

	
	/*stock price to know*/
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
