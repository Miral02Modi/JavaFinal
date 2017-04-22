package com.bridgelabz.programs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OrderList {
	public static void main(String[] args) {
		FileReader fr = new FileReader();
		String str = "";
		try {
			str = fr.reader("src/txtFile/Integer.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String s1[] = str.split(" ");

		int[] array = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray(); // Lambda
																				// Expression
																				// in
																				// java

		Integer[] newArray = new Integer[array.length];
		int i = 0;
		for (int value : array) {
			newArray[i++] = Integer.valueOf(value);
		}
		newArray = BubbleSort.bubbleSort(newArray);

		List<Integer> list = new LinkedList<Integer>();

		for (int i1 : newArray)
			list.add(i1);

		System.out.println("Enter The Integer Value");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		if (list.contains(val)) {
			list.remove(list.indexOf(val));
			Integer arr[] = new Integer[list.size()];
			list.toArray(arr);
			String str1 = "";
			for (Integer i1 : arr)
				str1 = str1 + i1 + " ";
			FileWriter fw = new FileWriter();
			try {
				fw.writer(str1, "src/txtFile/Integer.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			list.add(val);
			Integer arr[] = new Integer[list.size()];
			list.toArray(arr);
			arr = BubbleSort.bubbleSort(arr);
			for (int arr1 : arr)
				System.out.println(arr1);
			String str1 = "";
			for (Integer i1 : arr)
				str1 = str1 + i1 + " ";
			System.out.println(str);
			System.out.println(str1);
			FileWriter fw = new FileWriter();
			try {
				fw.writer(str1, "src/txtFile/Integer.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
