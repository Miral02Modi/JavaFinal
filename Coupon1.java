import java.util.Scanner;

public class Coupon1 {
	public static void main(String[] args) {
		
		int count=0;
		int numCoup;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value::");
		numCoup = sc.nextInt();
		int arr[] = new int[numCoup];
		int count1=0;
		Random rm = new Random(); 
		//System.out.println(arr.length);
		for (int i = 1; count1 != numCoup; i++) {
			boolean flag=true;
			int gen = (int)Math.round(Math.random() * numCoup ) +1 ;
			for(int j=0;j<arr.length;j++) {
				if (arr[j] == gen){
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
	}
}

