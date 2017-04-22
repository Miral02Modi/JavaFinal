import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Order {
	FileWriter fw = null;
	String rep;

	public void addToFile(String str) {

		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("/home/bridgeit/workspace/Hashing_Java/File/order.txt");
			byte b[] = str.getBytes();
			fout.write(b);
			fout.flush();
			System.out.println("Data inserted SuccessFully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String getFile() {
		String str = "";
		int i;
		try {
			FileInputStream fis = new FileInputStream("/home/bridgeit/workspace/Hashing_Java/File/order.txt");
			try {
				while ((i = fis.read()) != -1) {
					str = str + (char) i;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String spDiv[] = str.split(" ");
		System.out.println(spDiv.length);
		int arr[] = new int[spDiv.length];

		for (int k = 0; k < spDiv.length; k++)
			arr[k] = Integer.parseInt(spDiv[k]);

		arr = bubbleSortInt(arr);
		String intToStr = "";
		for (int k : arr)
			intToStr = intToStr + k + " ";
		return intToStr;
	}

	public static int[] bubbleSortInt(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Order ul = new Order();
		String str = ul.getFile();
		String str1[] = str.split(" ");
		System.out.print("Enter The String::");
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();

		LinkedList<String> ls = new LinkedList<>();
		for (int i = 0; i < str1.length; i++)
			ls.add(str1[i]);

		if (ls.contains(ip)) {
			ls.remove(ls.indexOf(ip));
			String s1 = "";
			for (String s11 : ls)
				s1 = s1 + s11 + " ";
			ul.addToFile(s1);
		} else {
			ls.add(ip);
			String s1 = "";
			for (String s11 : ls)
				s1 = s1 + s11 + " ";
			String strWrite[] = s1.split(" ");
			int arr[] = new int[strWrite.length];

			for (int k = 0; k < strWrite.length; k++)
				arr[k] = Integer.parseInt(strWrite[k]);

			arr = bubbleSortInt(arr);
			String intToStr = "";
			for (int k : arr)
				intToStr = intToStr + k + " ";
			System.out.println(intToStr);
			ul.addToFile(intToStr);
		}

	}

}
