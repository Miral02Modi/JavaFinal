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
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter The Data::");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n------------------------");
		
		OutputStream out = new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		OutputStreamWriter ow = new OutputStreamWriter(out);
		PrintWriter pw = new PrintWriter(System.out);;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				pw.println(arr[i][j]);
			}
		}
		pw.flush();
		pw.close();
	}
}
