import java.util.*;
class Coupon{
  
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("ENter The  Coupoun");
       int numCoup = sc.nextInt();
       System.out.println("Enter The coupen Range");
       int  range = sc.nextInt(),i=0;
       Random ranGen = new Random();	
    	
       while(i<numCoup){         

        System.out.println("Coupon is generated"+Math.round(ranGen.nextInt(range)	)); 
        i++;
      }
    }
}
