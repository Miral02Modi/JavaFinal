import java.util.Scanner;
import java.time.LocalTime; 
class Util
{
   
   static char[] bubbleSortString(String str) {  
        char temp = 0;  
	char arr[] = str.toCharArray();	
         for(int i=0; i < arr.length; i++)
	{  
                 for(int j=1; j < (arr.length-i); j++)
		{  
                          if(arr[j-1] > arr[j])
			  {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
    	return arr;
    }	
	
     public static int[] insertionSort(int arr[]) {  
        for (int j = 1; j < arr.length; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr[i] > key ) ) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
	return arr;
    }  	

    public static char[] insertionSort(char arr[]) {  
        for (int j = 1; j < arr.length; j++) {  
            char key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr[i] > key ) ) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
	return arr;
    }  			

    static int[] bubbleSortInt(int arr[]) { 
	int temp=0;  
         for(int i=0; i < arr.length; i++)
	{  
                 for(int j=1; j < (arr.length-i); j++)
		{  
                          if(arr[j-1] > arr[j])
			  {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
    	return arr;
    }		
	
   static public String binarySearchString(char[] arr, char key) {
		
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
		String s1 = ""+arr[mid];
                return s1;
            }
            if (key < arr[mid]) {
            	end = mid - 1;
            } else {
            	start = mid + 1;
            }
        }
        return null;
    }		 

  static public int binarySearchInt(int[] arr, int key) {
		
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return arr[mid];
            }
            if (key < arr[mid]) {
            	end = mid - 1;
            } else {
            	start = mid + 1;
            }
        }
        return -1;
    }	

	   			
   long startTime()
   {
	LocalTime lt = LocalTime.now();
	System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());
   	return System.currentTimeMillis();
   }
   
   long endTime(){
	LocalTime lt = LocalTime.now();
	System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());
   	return System.currentTimeMillis();
   }	
   
   long elapseTime()
   {
	Scanner sc = new Scanner(System.in);
   	System.out.println("Enter 1 for Start the clock");
	int tmp1 = sc.nextInt();
	long sTime = startTime();   	
	System.out.println("please wait sometime");
	
	try{
  	  Thread.sleep(10000);
	}catch(Exception e)
	{
	    e.printStackTrace();			
	}
 	System.out.println("Enter 2 for end the clock");
	int tmp2 = sc.nextInt();
	long eTime = endTime();
	return eTime - sTime; 
   }		
 
   void stockPrice(Stock st[] ,String name)
   {	
	int price = 0;	
	for(int i = 0 ; i < st.length; i++){
	 	if(name.equals(st[i].getName()))	
		{
		   System.out.println("Each share price "+(st[i].getnumShare() * st[i].getPrice()));
		}
		price = price + (st[i].getnumShare() * st[i].getPrice());					
	}
	System.out.println(price);						  
   } 	
}
