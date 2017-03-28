import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int head=0,tail=0;
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Number of Time to Flip");
		int flip = scr.nextInt();
		
		for(int i=1; i<flip ;i++){
			if(Math.random()<=0.5)
				head++;
			else
				tail++;
		}
		double perset=(double)(head/flip)*100;
		System.out.println("Head Percentage is::"+perset);
		System.out.println("Tail Percentage is::"+(100-perset)+"%");
	}

}
