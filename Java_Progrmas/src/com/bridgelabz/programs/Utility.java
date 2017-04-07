package com.bridgelabz.programs;
class Utility {
	public static void main(String args[]) {
		int arr[] = { 1, 4, 3, 5, 2 };
		arr = Util.insertionSort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		arr = Util.bubbleSortInt(arr);
		System.out.println(Util.binarySearchInt(arr, 3));
		String str = "hello welcome to java world";
		char ch[] = Util.insertionSort(str.toCharArray());
		for (int i = 0; i < ch.length; i++)
			System.out.println(ch[i]);
		char ch1[] = Util.bubbleSortString(str);
		System.out.println(Util.binarySearchString(ch, 'h'));

	}
}
