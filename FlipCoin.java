import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		double head=0,tail=0;
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Number of Time to Flip");
		int flip = scr.nextInt();
		
		for(int i=1; i<flip ;i++){
			if(Math.random()<=0.5)
				head++;
			else
				tail++;
		}
		double perset=(head/flip)*100;
		System.out.println("Head Percentage is::"+(int)perset+"%");
		System.out.println("Tail Percentage is::"+(int)(100-perset)+"%");
	}

}
