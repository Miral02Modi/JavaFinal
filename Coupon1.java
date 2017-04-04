
import java.util.*;

class Coupon1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The  Coupoun");
		int numCoup = sc.nextInt();
		System.out.println("Enter The coupen Range");
		int range = sc.nextInt(), i = 0;
		
		double arr[] = new double[numCoup];
		Random ar = new Random();
		int gen,count=0,count1=0;
		int gen1=0;

		while (i < numCoup) {
			boolean flag = true;				
			gen1 = (int)Math.round(Math.random() * numCoup + 1) ;
			count1++;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == gen1){
					flag = false;  
					break;
				}
			}
			if (flag) {
				arr[count++] = gen1 ;
				System.out.println(gen1);
				i++;
			}
		}
		System.out.println("Count is::"+count1);
	}
}
