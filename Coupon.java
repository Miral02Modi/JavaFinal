import java.util.*;
class Coupon{
  
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("ENter The  Coupoun");
       int numCoup = sc.nextInt();
       System.out.println("Enter The coupen Range");
       int  range = sc.nextInt(),i=0;
       Random ranGen = new Random();	
       int arr[] = new int[numCoup];
       Random ar = new Random();  
       boolean flag = false;	
       int gen;				
       while(i < numCoup){
	gen=Math.round(ar.nextInt());		
	for(int j=0 ;j<arr.length; j++){
	    if(arr[i] != gen)
		flag = false;		
	}
	if(flag){
	   System.out.println(gen);
	   i--; 			
	}
      }	
    }
}
