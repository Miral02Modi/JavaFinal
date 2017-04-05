import java.util.Scanner;
class FindNumber{
    static int count=0;	       
    static boolean isPresent(int start , int end ,int ch)	
     {
	
	int mid = (start + end) / 2;
	Scanner scr = new Scanner(System.in);
	if(count == ch)
	{
	  System.out.println("Your Number is "+mid+"?");
	  String str = scr.next(); 
	  boolean flag = str.equalsIgnoreCase("yes");
 	  if(flag)
	    return true;
	  else{
	    System.out.println("Your Number is"+(mid+1));	
	    return true;
	   }           		 	 	  	
	}
	System.out.println("Your Number is less than "+mid+" yes or No");
	String str = scr.next(); 
	boolean flag = str.equalsIgnoreCase("yes");	
	count++;	
	if(flag)
	{
	   end = mid ;
           isPresent(start , end ,ch);				
	}else{
	   start = mid ;
	   isPresent(start , end ,ch);					
	}
	return true; 
     }		 	
      public static void main(String args[])
     {	
	Scanner scr1 = new Scanner(System.in);
	System.out.println("Enter The two to the Power");
	int range = scr1.nextInt();	
	int pow =(int)Math.pow(2 ,range);	
	System.out.println("Assume One Number please between 1 to "+pow);
	isPresent(0 , pow, range-1); 	
     }	
}
