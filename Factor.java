import java.util.*;
class  Factor{
   public static void main(String args[]){
        int prime=2;
        int count=0;

	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Prime factor you Want");
	count= sc.nextInt();

	while(count > 0){
	   int i=2;boolean flag=true;
	   while(prime > i ){
           	if(prime % i == 0){
		   flag=false;
		}
		i++;
 	   }
	    if(flag){
	     System.out.println("Prime Factor is::"+prime);
              count--;
	    }
	  prime++;
	}
   }
}
