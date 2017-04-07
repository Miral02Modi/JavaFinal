import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner m = null;
		try {
			m = new Scanner(new File("/home/bridgeit/workspace/Hashing_Java/File/hash.txt"));
			m.useDelimiter(" ");
		} catch (Exception e) {
			System.out.println("could not find file");
		}
		String s1 = "";
		while (m.hasNext()) {
			s1 = s1 + m.next() + " ";
		}

		String str[] = s1.split(" ");
		int num[] = new int[str.length];
		for (int i = 0; i < num.length; i++)
			num[i] = Integer.parseInt(str[i]);
		ArrayList rl = new ArrayList();
		HashMap hm = new HashMap();

		int l = num.length;
		for (int i = 0; i <= num.length; i++) {
			Integer i1 = new Integer(i);
			hm.put(i1, new ArrayList());
		}
		for (int i = 0; i < num.length; i++) {
			int rem = num[i] % (num.length + 1);
			Integer i1 = new Integer(rem);
			ArrayList al = (ArrayList) hm.get(i1);
			Integer i2 = new Integer(num[i]);
			al.add(i2);
		}
		System.out.println(hm);
		System.out.println("Enter the value");
		Integer serNum = sc.nextInt();
		boolean flag = false;
		
		for (int i = 0; i < num.length + 1; i++) {
			ArrayList al = (ArrayList) hm.get(i);
			if (al.contains(serNum)) {
				al.remove(al.indexOf(serNum));
				flag = true;
			}
		}
		if (!flag) {
			int rem = serNum % (num.length + 1);
			Integer i1 = new Integer(rem);
			ArrayList al = (ArrayList) hm.get(i1);
			al.add(serNum);
		}
		System.out.println(hm);
	}

}
