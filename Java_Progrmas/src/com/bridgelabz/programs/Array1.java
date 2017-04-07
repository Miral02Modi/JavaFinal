package com.bridgelabz.programs;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Array1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The rows::");
		int rows = sc.nextInt();
		System.out.print("Enter The cols::");
		int cols = sc.nextInt();
		Util.d2Array(rows, cols);
	}
}
